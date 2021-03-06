package com.feri.fyw.dao;

import com.feri.fyw.entity.Notice;
import com.feri.fyw.entity.NoticeRead;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: FengYuWisdom
 * @description:
 * @author: Feri(邢朋辉)
 * @create: 2021-06-17 10:53
 */
public interface NoticeReadDao {
    int insert(@Param("sid")int sid,@Param("nid") int nid);
    List<NoticeRead> selectAll();
}
