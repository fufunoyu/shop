package cn.cie.services;

import cn.cie.entity.Tag;
import cn.cie.entity.dto.GameDTO;
import cn.cie.utils.Result;

import java.util.List;

/**
 * Created by RojerAlone on 2017/6/7.
 */
public interface TagService {

    /**
     * 获取所有的标签
     * @return
     */
    Result<List<Tag>> getAll();

    /**
     * 添加标签，不绑定到游戏
     * @param name
     * @return
     */
    Result<Tag> addTag(String name);

    /**
     * 添加标签并绑定到游戏
     * @param name
     * @param game
     * @return
     */
    Result addTag(String name, Integer game);

    /**
     * 绑定标签到游戏
     * @param tag
     * @param game
     * @return
     */
    Result addTag(Integer tag, Integer game);

    /**
     * 根据标签获取所有游戏
     * @param tag
     * @return
     */
    Result<List<GameDTO>> getGamesByTag(Integer tag);

}
