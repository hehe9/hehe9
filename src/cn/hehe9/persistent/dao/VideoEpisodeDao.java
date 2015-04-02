package cn.hehe9.persistent.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.hehe9.persistent.entity.VideoEpisode;
import cn.hehe9.persistent.mapper.VideoEpisodeMapper;

@Service
@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
public class VideoEpisodeDao {

	@Resource
	private VideoEpisodeMapper videoEpisodeMapper;

	public int save(VideoEpisode ve) {
		ve.setCreateTime(new Date());
		return videoEpisodeMapper.insertSelective(ve);
	}

	public VideoEpisode findByVideoIdEpisodeNo(Integer videoId, Integer episodeNo) {
		return findBy(videoId, episodeNo);
	}

	/**
	 * 根据条件, 查询视频信息
	 * @param episodeNo	集数
	 * @param page	查询页码
	 * @param count	查询数量
	 * @return
	 */
	public VideoEpisode findBy(Integer videoId, Integer episodeNo) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("videoId", videoId);
		params.put("episodeNo", episodeNo);
		params.put("offset", 0);
		params.put("count", Integer.MAX_VALUE);
		List<VideoEpisode> result = videoEpisodeMapper.findBy(params);
		if (result == null || result.isEmpty()) {
			return null;
		}
		return result.get(0);
	}

	public int udpate(VideoEpisode ve) {
		return videoEpisodeMapper.updateByPrimaryKeySelective(ve);
	}
}
