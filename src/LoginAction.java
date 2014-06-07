import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author gejing gjblmdlm@sina.com
 * @version Creation Time：2014-6-7 下午3:39:56
 * 
 */
public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	
	
	@Override
	public String execute() throws Exception{
		LoginBean bean=new LoginBean();
		if (bean.isLogin(userName, password)) {
			//获取ActionContext
			ActionContext a=ActionContext.getContext();
			//把输入的用户名保存到session中
			a.getSession().put("userName", userName);
			
			
			return SUCCESS;
		}else {
			return LOGIN;
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
