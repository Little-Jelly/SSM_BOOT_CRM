package com.yyf.service;

import com.yyf.po.BaseDict;

import java.util.List;

public interface BaseDictService {
    public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
