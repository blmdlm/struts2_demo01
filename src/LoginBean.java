/**
 * @author gejing gjblmdlm@sina.com
 * @version Creation Time：2014-6-7 下午3:34:48
 * 
 */
public class LoginBean {
	private String userName;
	private String password;
	/**
	 * 判断是否登录成功
	 * @param userName
	 * @param password
	 * @return 成功true,失败false
	 */
	public boolean isLogin(String userName,String password){
		
		org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter a=new org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter();
		
		
		if ("hello".equals(userName)&&"123".equals(password)) {
			return true;
		}else {
			return false;
		}
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
