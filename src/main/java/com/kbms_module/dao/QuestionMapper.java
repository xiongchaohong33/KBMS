package com.kbms_module.dao;


import com.kbms_module.pojo.Btype;
import com.kbms_module.pojo.Comments;
import com.kbms_module.pojo.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated
     */
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated
     */
    Question selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Question record);

    List<com.kbms_module.pojo.Question> getHostQues(Integer i);

    /**
     * 得到问题所有的类别
     * @return
     */
    List<Btype> selectAllType();

    /**
     * 得到大分类下所有的问题
     * @param btypeId
     * @return
     */
    List<Question> getQuestionByBId(Integer btypeId);

    /**
     * 得到小分类下所有的问题
     * @param sid
     * @return
     */
    List<Question> getQuestionBySId(Integer sid);

    /**
     * 得到所有的文档
     * @return
     */
    List<Question> geQuestion();

    /**
     * 分类查找
     * @param i
     * @param pageSize
     * @param btypeId
     * @param sid
     * @return
     */
    List<Question> getPageListQustion(@Param("i") int i, @Param("pageSize") int pageSize, @Param("btypeId") Integer btypeId, @Param("sid") Integer sid);

     List<Question>  selectQuestionbyStatus(@Param("problemnums") Integer problemnums, @Param("btypeId") Integer btypeId, @Param("sid") Integer sid);

    /**
     * 返回确定的答案
     * @return
     */
    Comments getSureAnswer(Integer qid);


    /**
     * 返回不确定的回答
     * @param qid
     * @return
     */
    List<Comments> getUsureAnswer(Integer qid);

    Question getQuestionById(Integer qid);

    /**
     * 创建问题
     * @param question
     */
    void createQuestion(Question question);
}