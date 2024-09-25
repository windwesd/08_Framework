package com.kh.test.customer.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

  int deleteCustomer(int customerNo);
}
