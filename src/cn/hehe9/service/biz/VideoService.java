package cn.hehe9.service.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hehe9.common.constants.ComConstant;
import cn.hehe9.persistent.dao.VideoDao;
import cn.hehe9.persistent.dao.VideoSourceDao;
import cn.hehe9.persistent.entity.Video;
import cn.hehe9.persistent.entity.VideoSource;

@Service
public class VideoService {
	@Resource
	private VideoDao videoDao;

	public List<Video> listBrief(Integer page, Integer count) {
		return videoDao.listBrief(page, count);
	}
}
