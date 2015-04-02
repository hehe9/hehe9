package cn.hehe9.persistent.entity;

import java.io.Serializable;
import java.util.Date;

public class VideoEpisode implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.video_id
     *
     * @mbggenerated
     */
    private Integer videoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.episode_no
     *
     * @mbggenerated
     */
    private Integer episodeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.play_page_url
     *
     * @mbggenerated
     */
    private String playPageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.snapshot_url
     *
     * @mbggenerated
     */
    private String snapshotUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.file_url
     *
     * @mbggenerated
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_episode.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_episode
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.id
     *
     * @return the value of video_episode.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.id
     *
     * @param id the value for video_episode.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.video_id
     *
     * @return the value of video_episode.video_id
     *
     * @mbggenerated
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.video_id
     *
     * @param videoId the value for video_episode.video_id
     *
     * @mbggenerated
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.title
     *
     * @return the value of video_episode.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.title
     *
     * @param title the value for video_episode.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.episode_no
     *
     * @return the value of video_episode.episode_no
     *
     * @mbggenerated
     */
    public Integer getEpisodeNo() {
        return episodeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.episode_no
     *
     * @param episodeNo the value for video_episode.episode_no
     *
     * @mbggenerated
     */
    public void setEpisodeNo(Integer episodeNo) {
        this.episodeNo = episodeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.play_page_url
     *
     * @return the value of video_episode.play_page_url
     *
     * @mbggenerated
     */
    public String getPlayPageUrl() {
        return playPageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.play_page_url
     *
     * @param playPageUrl the value for video_episode.play_page_url
     *
     * @mbggenerated
     */
    public void setPlayPageUrl(String playPageUrl) {
        this.playPageUrl = playPageUrl == null ? null : playPageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.snapshot_url
     *
     * @return the value of video_episode.snapshot_url
     *
     * @mbggenerated
     */
    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.snapshot_url
     *
     * @param snapshotUrl the value for video_episode.snapshot_url
     *
     * @mbggenerated
     */
    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl == null ? null : snapshotUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.file_url
     *
     * @return the value of video_episode.file_url
     *
     * @mbggenerated
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.file_url
     *
     * @param fileUrl the value for video_episode.file_url
     *
     * @mbggenerated
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.remark
     *
     * @return the value of video_episode.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.remark
     *
     * @param remark the value for video_episode.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.create_time
     *
     * @return the value of video_episode.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.create_time
     *
     * @param createTime the value for video_episode.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_episode.modify_time
     *
     * @return the value of video_episode.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_episode.modify_time
     *
     * @param modifyTime the value for video_episode.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}