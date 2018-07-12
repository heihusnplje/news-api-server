package com.tigerjoys.news.inter.contract.impl;

import org.springframework.stereotype.Repository;

import com.tigerjoys.news.inter.contract.IYdzxInfoContract;
import com.tigerjoys.news.inter.entity.YdzxInfoEntity;
import com.tigerjoys.nbs.mybatis.core.contract.AbstractBaseContract;
import com.tigerjoys.news.inter.mapper.YdzxInfoMapper;

/**
 * 数据库中  [t_ydzx_info]表 接口实现类
 * @author yangjunming
 * @Date 2018-07-12 18:08:25
 *
 */
@Repository
public class YdzxInfoContractImpl extends AbstractBaseContract<YdzxInfoEntity , YdzxInfoMapper> implements IYdzxInfoContract {
	
}
