package com.tigerjoys.news.inter.contract.impl;

import org.springframework.stereotype.Repository;

import com.tigerjoys.news.inter.contract.IYdzxTestContract;
import com.tigerjoys.news.inter.entity.YdzxTestEntity;
import com.tigerjoys.nbs.mybatis.core.contract.AbstractBaseContract;
import com.tigerjoys.news.inter.mapper.YdzxTestMapper;

/**
 * 数据库中  [t_ydzx_test]表 接口实现类
 * @author yangjunming
 * @Date 2018-07-16 18:06:16
 *
 */
@Repository
public class YdzxTestContractImpl extends AbstractBaseContract<YdzxTestEntity , YdzxTestMapper> implements IYdzxTestContract {
	
}
