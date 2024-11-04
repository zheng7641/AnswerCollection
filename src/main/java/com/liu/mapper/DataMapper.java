package com.liu.mapper;

import com.liu.DataSubmitVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author zhengchentong on 2019-06-14
 */
@Mapper
public interface DataMapper {
    @Insert("INSERT INTO kg.question_collection(q1, q1_string, q2, q2_string, q3, q3_string, q4_string, q5, q5_string, q6_string, q7,q7_string, q8_string, q61, q61_string, q62, q62_string, q63, q63_string, q64, q65, q66, q67, f4UserResult, f5DataResult, shortData, shortResult, fullResult) VALUES (#{dataSubmitVo.question_1}, #{dataSubmitVo.question_1_stirng}, #{dataSubmitVo.question_2}, #{dataSubmitVo.question_2_stirng}, #{dataSubmitVo.question_3}, #{dataSubmitVo.question_3_stirng}, #{dataSubmitVo.question_4}, #{dataSubmitVo.question_5}, #{dataSubmitVo.question_5_string}, #{dataSubmitVo.question_6}, #{dataSubmitVo.question_7}, #{dataSubmitVo.question_7_string}, #{dataSubmitVo.question_8}, #{dataSubmitVo.question61}, #{dataSubmitVo.question_61_string}, #{dataSubmitVo.question62}, #{dataSubmitVo.question_62_string}, #{dataSubmitVo.question63}, #{dataSubmitVo.question_63_string}, #{dataSubmitVo.question64}, #{dataSubmitVo.question65}, #{dataSubmitVo.question66}, #{dataSubmitVo.question67}, #{dataSubmitVo.f4UserResult}, #{dataSubmitVo.f5DataResult}, #{dataSubmitVo.shortData}, #{dataSubmitVo.shortResult}, #{dataSubmitVo.fullResult});")
    void insert(@Param("dataSubmitVo") DataSubmitVo dataSubmitVo);

    @Select("select * from kg.question_collection")
    List<Map<Object, Object>> loadData();

}
