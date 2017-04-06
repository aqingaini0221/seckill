package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Successkilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Administrator on 2017/3/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccesskilledDaoTest {

    @Autowired
    SuccesskilledDao successkilledDao;
    @Test
    public void insertSuccesskilled() throws Exception{
        long seckillId = 1000L;
        long userPhone = 15751866558L;
        int row = successkilledDao.insertSuccesskilled(seckillId,userPhone);
        System.out.println(row);
    }
    @Test
    public void queryByIdWithSeckill() throws  Exception {
        long seckillId=1000L;
        long userPhone=15751866348L;
        Successkilled successkilled=successkilledDao.queryByIdWithSeckill(seckillId,userPhone);
        System.out.println(successkilled);
        System.out.println(successkilled.getSeckillId());
    }
}
