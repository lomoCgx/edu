package api.entity;

import java.util.Date;

/**
 * 用户实体类
 * @author Lenovo
 *
 */
public class DubboUser implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private Integer version;

    private Date createTime;

    private String userNo;

    private String userType;

    private Long mainUserId;

    private String userPwd;

    private String userName;

    private String mobileNo;

    private Integer status;

    private Date lastLoginTime;

    private Integer isChangedPwd;

    private Integer pwdErrorCount;

    private Date pwdErrorTime;

    private String remark;

    private byte[] email;
	
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public Long getMainUserId() {
		return mainUserId;
	}
	public void setMainUserId(Long mainUserId) {
		this.mainUserId = mainUserId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public byte[] getEmail() {
		return email;
	}
	public void setEmail(byte[] email) {
		this.email = email;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Integer getIsChangedPwd() {
		return isChangedPwd;
	}
	public void setIsChangedPwd(Integer isChangedPwd) {
		this.isChangedPwd = isChangedPwd;
	}
	public Integer getPwdErrorCount() {
		return pwdErrorCount;
	}
	public void setPwdErrorCount(Integer pwdErrorCount) {
		this.pwdErrorCount = pwdErrorCount;
	}
	public Date getPwdErrorTime() {
		return pwdErrorTime;
	}
	public void setPwdErrorTime(Date pwdErrorTime) {
		this.pwdErrorTime = pwdErrorTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
