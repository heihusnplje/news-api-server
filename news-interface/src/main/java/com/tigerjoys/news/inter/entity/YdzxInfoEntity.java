package com.tigerjoys.news.inter.entity;

import java.io.Serializable;
import java.util.Date;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.Column;
import org.apache.ibatis.annotations.Id;
import org.apache.ibatis.annotations.Table;
import com.tigerjoys.nbs.mybatis.core.BaseEntity;

/**
 * 数据库中  [t_ydzx_info] 表对应的实体类
 * @author yangjunming
 * @Date 2018-07-12 18:08:25
 *
 */
@Table(name="t_ydzx_info")
public class YdzxInfoEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * id
	 */
	@Id
	@Column(name="id",nullable=false,jdbcType=JdbcType.BIGINT,comment="id")
	private Long id;
	
	/**
	 * title
	 */
	@Column(name="title",nullable=true,jdbcType=JdbcType.VARCHAR,comment="title")
	private String title;
	
	/**
	 * extra
	 */
	@Column(name="extra",nullable=true,jdbcType=JdbcType.VARCHAR,comment="extra")
	private String extra;
	
	/**
	 * create_time
	 */
	@Column(name="create_time",nullable=true,jdbcType=JdbcType.TIMESTAMP,comment="create_time")
	private Date create_time;
	
	/**
	 * docid
	 */
	@Column(name="docid",nullable=true,jdbcType=JdbcType.VARCHAR,comment="docid")
	private String docid;
	
	/**
	 * meta
	 */
	@Column(name="meta",nullable=true,jdbcType=JdbcType.VARCHAR,comment="meta")
	private String meta;
	
	/**
	 * ctype
	 */
	@Column(name="ctype",nullable=true,jdbcType=JdbcType.VARCHAR,comment="ctype")
	private String ctype;
	
	/**
	 * dtype
	 */
	@Column(name="dtype",nullable=true,jdbcType=JdbcType.INTEGER,comment="dtype")
	private Integer dtype;
	
	/**
	 * impid
	 */
	@Column(name="impid",nullable=true,jdbcType=JdbcType.VARCHAR,comment="impid")
	private String impid;
	
	/**
	 * pageid
	 */
	@Column(name="pageid",nullable=true,jdbcType=JdbcType.VARCHAR,comment="pageid")
	private String pageid;
	
	/**
	 * itemid
	 */
	@Column(name="itemid",nullable=true,jdbcType=JdbcType.VARCHAR,comment="itemid")
	private String itemid;
	
	/**
	 * display_flag
	 */
	@Column(name="display_flag",nullable=true,jdbcType=JdbcType.INTEGER,comment="display_flag")
	private Integer display_flag;
	
	/**
	 * feedback_forbidden
	 */
	@Column(name="feedback_forbidden",nullable=true,jdbcType=JdbcType.TINYINT,comment="feedback_forbidden")
	private Integer feedback_forbidden;
	
	/**
	 * security
	 */
	@Column(name="security",nullable=true,jdbcType=JdbcType.INTEGER,comment="security")
	private Integer security;
	
	/**
	 * tags
	 */
	@Column(name="tags",nullable=true,jdbcType=JdbcType.VARCHAR,comment="tags")
	private String tags;
	
	/**
	 * summary
	 */
	@Column(name="summary",nullable=true,jdbcType=JdbcType.VARCHAR,comment="summary")
	private String summary;
	
	/**
	 * b_political
	 */
	@Column(name="b_political",nullable=true,jdbcType=JdbcType.TINYINT,comment="b_political")
	private Integer b_political;
	
	/**
	 * image_urls
	 */
	@Column(name="image_urls",nullable=true,jdbcType=JdbcType.VARCHAR,comment="image_urls")
	private String image_urls;
	
	/**
	 * source
	 */
	@Column(name="source",nullable=true,jdbcType=JdbcType.VARCHAR,comment="source")
	private String source;
	
	/**
	 * url
	 */
	@Column(name="url",nullable=true,jdbcType=JdbcType.VARCHAR,comment="url")
	private String url;
	
	/**
	 * mtype
	 */
	@Column(name="mtype",nullable=true,jdbcType=JdbcType.INTEGER,comment="mtype")
	private Integer mtype;
	
	/**
	 * category
	 */
	@Column(name="category",nullable=true,jdbcType=JdbcType.VARCHAR,comment="category")
	private String category;
	
	/**
	 * comment_count
	 */
	@Column(name="comment_count",nullable=true,jdbcType=JdbcType.INTEGER,comment="comment_count")
	private Integer comment_count;
	
	/**
	 * dis_recommend
	 */
	@Column(name="dis_recommend",nullable=true,jdbcType=JdbcType.TINYINT,comment="dis_recommend")
	private Integer dis_recommend;
	
	/**
	 * edit_cover
	 */
	@Column(name="edit_cover",nullable=true,jdbcType=JdbcType.TINYINT,comment="edit_cover")
	private Integer edit_cover;
	
	/**
	 * image
	 */
	@Column(name="image",nullable=true,jdbcType=JdbcType.VARCHAR,comment="image")
	private String image;
	
	/**
	 * upload_images
	 */
	@Column(name="upload_images",nullable=true,jdbcType=JdbcType.VARCHAR,comment="upload_images")
	private String upload_images;
	
	/**
	 * alike
	 */
	@Column(name="alike",nullable=true,jdbcType=JdbcType.INTEGER,comment="alike")
	private Integer alike;
	
	/**
	 * up
	 */
	@Column(name="up",nullable=true,jdbcType=JdbcType.INTEGER,comment="up")
	private Integer up;
	
	/**
	 * auth
	 */
	@Column(name="auth",nullable=true,jdbcType=JdbcType.TINYINT,comment="auth")
	private Integer auth;
	
	/**
	 * is_gov
	 */
	@Column(name="is_gov",nullable=true,jdbcType=JdbcType.TINYINT,comment="is_gov")
	private Integer is_gov;
	
	/**
	 * content_type
	 */
	@Column(name="content_type",nullable=true,jdbcType=JdbcType.VARCHAR,comment="content_type")
	private String content_type;
	
	/**
	 * title_sn
	 */
	@Column(name="title_sn",nullable=true,jdbcType=JdbcType.INTEGER,comment="title_sn")
	private Integer title_sn;
	
	/**
	 * card_position
	 */
	@Column(name="card_position",nullable=true,jdbcType=JdbcType.VARCHAR,comment="card_position")
	private String card_position;
	
	/**
	 * wemedia_info
	 */
	@Column(name="wemedia_info",nullable=true,jdbcType=JdbcType.VARCHAR,comment="wemedia_info")
	private String wemedia_info;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	public String getDocid() {
		return docid;
	}

	public void setDocid(String docid) {
		this.docid = docid;
	}
	
	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}
	
	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	
	public Integer getDtype() {
		return dtype;
	}

	public void setDtype(Integer dtype) {
		this.dtype = dtype;
	}
	
	public String getImpid() {
		return impid;
	}

	public void setImpid(String impid) {
		this.impid = impid;
	}
	
	public String getPageid() {
		return pageid;
	}

	public void setPageid(String pageid) {
		this.pageid = pageid;
	}
	
	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	
	public Integer getDisplay_flag() {
		return display_flag;
	}

	public void setDisplay_flag(Integer display_flag) {
		this.display_flag = display_flag;
	}
	
	public Integer getFeedback_forbidden() {
		return feedback_forbidden;
	}

	public void setFeedback_forbidden(Integer feedback_forbidden) {
		this.feedback_forbidden = feedback_forbidden;
	}
	
	public Integer getSecurity() {
		return security;
	}

	public void setSecurity(Integer security) {
		this.security = security;
	}
	
	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public Integer getB_political() {
		return b_political;
	}

	public void setB_political(Integer b_political) {
		this.b_political = b_political;
	}
	
	public String getImage_urls() {
		return image_urls;
	}

	public void setImage_urls(String image_urls) {
		this.image_urls = image_urls;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public Integer getMtype() {
		return mtype;
	}

	public void setMtype(Integer mtype) {
		this.mtype = mtype;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Integer getComment_count() {
		return comment_count;
	}

	public void setComment_count(Integer comment_count) {
		this.comment_count = comment_count;
	}
	
	public Integer getDis_recommend() {
		return dis_recommend;
	}

	public void setDis_recommend(Integer dis_recommend) {
		this.dis_recommend = dis_recommend;
	}
	
	public Integer getEdit_cover() {
		return edit_cover;
	}

	public void setEdit_cover(Integer edit_cover) {
		this.edit_cover = edit_cover;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getUpload_images() {
		return upload_images;
	}

	public void setUpload_images(String upload_images) {
		this.upload_images = upload_images;
	}
	
	public Integer getAlike() {
		return alike;
	}

	public void setAlike(Integer alike) {
		this.alike = alike;
	}
	
	public Integer getUp() {
		return up;
	}

	public void setUp(Integer up) {
		this.up = up;
	}
	
	public Integer getAuth() {
		return auth;
	}

	public void setAuth(Integer auth) {
		this.auth = auth;
	}
	
	public Integer getIs_gov() {
		return is_gov;
	}

	public void setIs_gov(Integer is_gov) {
		this.is_gov = is_gov;
	}
	
	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	
	public Integer getTitle_sn() {
		return title_sn;
	}

	public void setTitle_sn(Integer title_sn) {
		this.title_sn = title_sn;
	}
	
	public String getCard_position() {
		return card_position;
	}

	public void setCard_position(String card_position) {
		this.card_position = card_position;
	}
	
	public String getWemedia_info() {
		return wemedia_info;
	}

	public void setWemedia_info(String wemedia_info) {
		this.wemedia_info = wemedia_info;
	}
	
}