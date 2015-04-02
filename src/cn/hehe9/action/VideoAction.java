package cn.hehe9.action;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.hehe9.common.constants.ComConstant;
import cn.hehe9.common.utils.DateUtil;
import cn.hehe9.common.utils.JacksonUtil;
import cn.hehe9.persistent.entity.Video;
import cn.hehe9.service.biz.VideoService;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class VideoAction extends ActionSupport {

	private static final Logger logger = LoggerFactory.getLogger(VideoAction.class);

	@Resource
	private VideoService videoService;

	public String list(Integer page, Integer pageCount) {
		int pageInt = page == null ? 1 : page;
		int pageCountInt = pageCount == null ? ComConstant.VIDEO_LIST_DEFAULT_COUNT : pageCount;
		List<Video> list = videoService.listBrief(page, pageCount);
		System.err.println(list.get(0).toString());
		if (list == null || list.isEmpty()) {
			return null;
		}
//		String videoList = JacksonUtil.encodeQuietly(list);
		return "toMain";
	}

	public String toMain() {
		// TODO 判断缓存中是否存在首页
		//--
		
		// 最火
		List<Video> hotVideoList = getHotVideoList();

		// 按字母, 各取N个
		
		return "toMain";
	}

	private List<Video> getHotVideoList() {
		return videoService.listBrief(1, ComConstant.VIDEO_LIST_DEFAULT_COUNT);
	}

	// List<List<Map<String,Object>>> jsonList = new
	// ArrayList<List<Map<String,Object>>>();
	// List<Map<String, Object>> itemList = new ArrayList<Map<String,Object>>();
	// for(int i = 0; i < list.size(); i ++)
	// {
	// if(i==7){ // 7个视频为一排
	// jsonList.add(itemList);
	// itemList = new ArrayList<Map<String,Object>>();
	// }
	//
	// Map<String,Object> map=new HashMap<String, Object>();
	// map.put("word", rs.getString("word"));
	// map.put("wordcount", rs.getInt("wordcount"));
	// list.add(map);
	// }
	// JSONArray jsarry = new JSONArray();
	// jsarry=JSONArray.fromObject(list);
	// result=jsarry.toString();
	// }
}
