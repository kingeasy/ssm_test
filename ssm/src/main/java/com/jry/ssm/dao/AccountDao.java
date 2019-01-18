package com.jry.ssm.dao;

import com.jry.ssm.domain.Account;
import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


/**
 * @author Jin
 */
public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();

    @Select("select * from account where name = #{name}")
    Account findByName(String name);

    @Update("update account set name = #{name} , money = #{money} where id = #{id}")
    void update(Account account);
}