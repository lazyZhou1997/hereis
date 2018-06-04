package edu.scu.hereis.dao;

import edu.scu.hereis.entity.Spot;
import edu.scu.hereis.entity.SpotExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SpotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    long countByExample(SpotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int deleteByExample(SpotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int insert(Spot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int insertSelective(Spot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    List<Spot> selectByExample(SpotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    Spot selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") Spot record, @Param("example") SpotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int updateByExample(@Param("record") Spot record, @Param("example") SpotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int updateByPrimaryKeySelective(Spot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    int updateByPrimaryKey(Spot record);

    /**
     * 获取上一条插入的记录的自增id
     * @param sql sql语句
     * @return 记录id
     */
    int selectLastInsertId(String sql);
}