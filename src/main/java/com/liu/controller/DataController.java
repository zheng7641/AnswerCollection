package com.liu.controller;

import com.alibaba.fastjson2.JSON;
import com.liu.DataResultVo;
import com.liu.DataSubmitVo;
import com.liu.data.DataSourceMap;
import com.liu.mapper.DataMapper;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zhengchentong on 2019-06-15
 */
@RestController
@RequestMapping("/data")
public class DataController {

    private final DataMapper dataMapper;

    public DataController(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    @RequestMapping("/loadData")
    public List<Map<Object, Object>> loadData() {
        return dataMapper.loadData();
    }

    @PostMapping("/submit")
    public String submit(DataSubmitVo dataSubmitVo) throws ServletException, IOException {
        DataResultVo dataResultVo = new DataResultVo();
        System.out.println(JSON.toJSONString(dataSubmitVo));
        Boolean aBoolean = dataCheck(dataSubmitVo);
        if (!aBoolean) {
            dataResultVo.setMessage("false");
            dataResultVo.setStatus(0);
            return JSON.toJSONString(dataResultVo);
        }


        double question6DoubleValue = 0.0;
        if (dataSubmitVo.getQuestion_5().equals("1")) {
            //F2
            question6DoubleValue = Double.parseDouble(dataSubmitVo.getQuestion_6());

            dataSubmitVo.setQuestion61(null);
            dataSubmitVo.setQuestion_61_string(null);
            dataSubmitVo.setQuestion62(null);
            dataSubmitVo.setQuestion_62_string(null);
            dataSubmitVo.setQuestion63(null);
            dataSubmitVo.setQuestion_63_string(null);
            dataSubmitVo.setQuestion64(null);
            dataSubmitVo.setQuestion65(null);
            dataSubmitVo.setQuestion66(null);
            dataSubmitVo.setQuestion67(null);

        } else if (dataSubmitVo.getQuestion_5().equals("2")) {
            //F1
            dataSubmitVo.setQuestion_6(null);

            //61题
            String question61String = DataSourceMap.question_61_map.get(dataSubmitVo.getQuestion61());
            dataSubmitVo.setQuestion_61_string(question61String);

            //62题
            String question62String = DataSourceMap.question_62_map.get(dataSubmitVo.getQuestion62());
            dataSubmitVo.setQuestion_62_string(question62String);

            //63题
            String question63String = DataSourceMap.question_63_map.get(dataSubmitVo.getQuestion63());
            dataSubmitVo.setQuestion_63_string(question63String);

            //key = 7_8_6_winter/spring/summer/autumn   62_63_61
            String winterKey = dataSubmitVo.getQuestion62() + "_" + dataSubmitVo.getQuestion63() + "_" + dataSubmitVo.getQuestion61() + "_winter";
            String springKey = dataSubmitVo.getQuestion62() + "_" + dataSubmitVo.getQuestion63() + "_" + dataSubmitVo.getQuestion61() + "_spring";
            String summerKey = dataSubmitVo.getQuestion62() + "_" + dataSubmitVo.getQuestion63() + "_" + dataSubmitVo.getQuestion61() + "_summer";
            String autumnKey = dataSubmitVo.getQuestion62() + "_" + dataSubmitVo.getQuestion63() + "_" + dataSubmitVo.getQuestion61() + "_autumn";

            Double winterValue = DataSourceMap.map3.get(winterKey);
            Double springValue = DataSourceMap.map3.get(springKey);
            Double summerValue = DataSourceMap.map3.get(summerKey);
            Double autumnValue = DataSourceMap.map3.get(autumnKey);

            double realWinterValue = Double.parseDouble(dataSubmitVo.getQuestion64()) * 3 / winterValue;
            double realSpringValue = Double.parseDouble(dataSubmitVo.getQuestion65()) * 3 / springValue;
            double realSummerValue = Double.parseDouble(dataSubmitVo.getQuestion66()) * 3 / summerValue;
            double realAutumnValue = Double.parseDouble(dataSubmitVo.getQuestion67()) * 3 / autumnValue;

            question6DoubleValue = realWinterValue + realSpringValue + realSummerValue + realAutumnValue;
        }

        //F3
        double question8DoubleValue = 0.0;
        if (StringUtils.hasText(dataSubmitVo.getQuestion_8())) {
            question8DoubleValue = Double.parseDouble(dataSubmitVo.getQuestion_8());
            if ("1".equals(dataSubmitVo.getQuestion_7())) {
                double v = question8DoubleValue * 12.37432;
                question8DoubleValue = question8DoubleValue + v;
            } else if ("2".equals(dataSubmitVo.getQuestion_7())) {
                double v = question8DoubleValue * 10.99035;
                question8DoubleValue = question8DoubleValue + v;
            } else if ("3".equals(dataSubmitVo.getQuestion_7())) {
                double v = question8DoubleValue * 12.78137;
                question8DoubleValue = question8DoubleValue + v;
            } else if ("4".equals(dataSubmitVo.getQuestion_7())) {
                double v = question8DoubleValue * 5.86152;
                question8DoubleValue = question8DoubleValue + v;
            } else if ("6".equals(dataSubmitVo.getQuestion_7())) {
                double v = question8DoubleValue;
                question8DoubleValue = question8DoubleValue + v;
            }
        }

        //F4
        double totalArea = Double.parseDouble(dataSubmitVo.getQuestion_4());
        double f4UserResult = (question6DoubleValue + question8DoubleValue) / totalArea;

        //F5
        //1题
        String question1String = DataSourceMap.question_1_map.get(dataSubmitVo.getQuestion_1());
        dataSubmitVo.setQuestion_1_stirng(question1String);
        //2题
        String question2String = DataSourceMap.question_2_map.get(dataSubmitVo.getQuestion_2());
        dataSubmitVo.setQuestion_2_stirng(question2String);
        //3题
        String question3String = DataSourceMap.question_3_map.get(dataSubmitVo.getQuestion_3());
        dataSubmitVo.setQuestion_3_stirng(question3String);
        //4题
        String question4String = dataSubmitVo.getQuestion_4();
        double question4double = Double.parseDouble(question4String);
        String question4Key = "";
        if (question4double <= 100) {
            question4Key = "0-100";
        } else if (question4double > 100 && question4double <= 200) {
            question4Key = "101-200";
        } else if (question4double > 200) {
            question4Key = ">200";
        }

        String map1Key = question1String + "_" + question2String + "_" + question3String + "_" + question4Key;
        String map1Value = DataSourceMap.map1.get(map1Key);
        double f5DataResult = 0.0;
        if (StringUtils.hasText(map1Value)) {
            f5DataResult = Double.parseDouble(map1Value);
        }

        //5题
        String question5String = DataSourceMap.question_5_map.get(dataSubmitVo.getQuestion_5());
        dataSubmitVo.setQuestion_5_string(question5String);

        //7题
        String question7String = DataSourceMap.question_7_map.get(dataSubmitVo.getQuestion_7());
        dataSubmitVo.setQuestion_7_string(question7String);

        //F6
        int fullResult = 0;
        if (f4UserResult < f5DataResult
                && (f5DataResult - f4UserResult) >= 21) {
            fullResult = 1;
        } else if (f4UserResult < f5DataResult
                && (f5DataResult - f4UserResult) > 10
                && (f5DataResult - f4UserResult) < 20) {
            fullResult = 2;
        } else if (Math.abs(f4UserResult - f5DataResult) <= 10) {
            fullResult = 3;
        } else if (f4UserResult > f5DataResult
                && (f4UserResult - f5DataResult) > 10
                && (f4UserResult - f5DataResult) < 20) {
            fullResult = 4;
        } else if (f4UserResult > f5DataResult
                && (f4UserResult - f5DataResult) >= 21
        ) {
            fullResult = 5;
        }

        System.out.println(f4UserResult);

        int shortResult = 0;
        int year = new Date().getYear() + 1900;
        Double shortData = DataSourceMap.map2.get(year);
        System.out.println(shortData);
        if (f4UserResult < shortData && shortData - f4UserResult > 20) {
            shortResult = 1;
        } else if (Math.abs(f4UserResult - shortData) <= 20) {
            shortResult = 2;
        } else if (f4UserResult > shortData && f4UserResult - shortData > 20) {
            shortResult = 3;
        }
        //done

        dataResultVo.setStatus(1);
        dataResultVo.setMessage("success");
        dataResultVo.setShortResult(shortResult);
        dataResultVo.setFullResult(fullResult);

        dataSubmitVo.setF4UserResult(f4UserResult+"");
        dataSubmitVo.setF5DataResult(f5DataResult + "");
        dataSubmitVo.setShortData(shortData + "");
        dataSubmitVo.setShortResult(shortResult + "");
        dataSubmitVo.setFullResult(fullResult + "");
        dataMapper.insert(dataSubmitVo);

        return JSON.toJSONString(dataResultVo);
    }

    private Boolean dataCheck(DataSubmitVo dataSubmitVo) {
        return true;
    }
}