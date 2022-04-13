package com.study.shoestrade.service;


import com.study.shoestrade.dto.BrandDto;

import java.util.List;

public interface BrandService {
    /**
     * 브랜드 등록
     *
     * @param name 등록할 브랜드 이름
     * @return 등록된 브랜드 id
     */
    BrandDto saveBrand(String name);

    /**
     * 브랜드 수정
     *
     * @param brandDto 수정할 브랜드
     */
    void updateBrand(BrandDto brandDto);

    /**
     * 브랜드 삭제
     *
     * @param id 삭제할 브랜드 id
     */
    void deleteByBrandId(Long id);

    /**
     * 브랜드 전체 검색
     *
     * @return 브랜드 전체 리스트
     */
    List<BrandDto> findBrandAll();

    /**
     * 브랜드 이름으로 검색
     *
     * @param name 검색할 브랜드 이름
     * @return 검색된 브랜드 리스트
     */
    List<BrandDto> findByBrandName(String name);
}

