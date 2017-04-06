package org.seckill.dao;

import org.seckill.entity.Successkilled;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/3/30.
 */
public interface SuccesskilledDao {
    //插入购买明细，可重复过滤
     // @return插入的行数
    int insertSuccesskilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    //根据秒杀商品的id查询明细Successkilled对象（该对象携带了seckill秒杀产品对象）
    Successkilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    }
