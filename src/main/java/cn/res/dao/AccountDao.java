package cn.res.dao;

import cn.res.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Rz
 * @Date 2019/6/27
 * @Time 11:44
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account values(null,#{name},#{money})")
    public void insert(Account account);

    @Select("select * from account where name = #{name}")
    public Account findAccountByName(String name);

    @Update("update account set money = #{money} where id = #{id}")
    public void transferTo(Account accountIn);

    @Update("update account set money = #{money} where id = #{id}")
    public void transferIn(Account nameOut);
}
