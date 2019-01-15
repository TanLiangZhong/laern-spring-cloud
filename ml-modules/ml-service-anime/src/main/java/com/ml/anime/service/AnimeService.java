package com.ml.anime.service;

import com.ml.anime.entity.Anime;

import java.util.List;

/**
 * 动漫 - 服务接口
 *
 * @author liangzhong
 * @date 2019/1/14 13:51
 */
public interface AnimeService {


    /**
     * 保存
     *
     * @param anime
     * @return 结果
     */
    Anime save(Anime anime);

    /**
     * 修改
     *
     * @param anime
     * @return success = true ,  fail = false
     */
    Boolean update(Anime anime);

    /**
     * 删除
     *
     * @param id 主键
     * @return success = true ,  fail = false
     */
    Boolean delete(Long id);

    /**
     * 根据Id查询
     *
     * @param id 主键
     * @return anime
     */
    Anime findById(Long id);

    /**
     * 查询列表
     *
     * @param anime 查询条件
     * @return anime列表
     */
    List<Anime> findList(Anime anime);

    /**
     * 查询列表
     *
     * @return
     */
    List<Anime> findPage(Anime anime);
}