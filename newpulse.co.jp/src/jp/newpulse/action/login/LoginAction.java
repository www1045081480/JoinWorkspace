package jp.newpulse.action.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.np.base.orm.Criteria;
import com.np.base.orm.Restrictions;
import com.np.base.utils.MD5;
import com.np.order.action.SessionMgr;
import com.np.order.models.NapaStores;
import com.np.order.models.Users;
import com.opensymphony.xwork2.ActionContext;

import jp.newpulse.action.BaseAction;
import jp.newpulse.action.search.SearchAction;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {
	private static Log logger = LogFactory.getLog(LoginAction.class);
	private String userId;
	private String passWord;
	private Users user;
	private String login;
	private String NapaId;
	private String Cname;
	private NapaStores napastores;
	public String getNapaId() {
		return NapaId;
	}

	public void setNapaId(String napaId) {
		NapaId = napaId;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public NapaStores getNapastores() {
		return napastores;
	}

	public void setNapastores(NapaStores napastores) {
		this.napastores = napastores;
	}

	public List<NapaStores> getList() {
		return list;
	}

	public void setList(List<NapaStores> list) {
		this.list = list;
	}

	private List<NapaStores> list = new ArrayList<NapaStores>();
	private Map<String, Object> session;

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private boolean accept() {
		String userAgent = ServletActionContext.getRequest().getHeader("user-agent");
		logger.debug("user-agent = " + userAgent);
		if (userAgent.indexOf("Firefox") != -1) {
			return true;
		}
		if (userAgent.indexOf("Chrome") != -1) {
			return true;
		}
		return false;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		
		logger.debug("############login#########");
		//登陆画面需要重新做
		Criteria<NapaStores> criteria = new Criteria(NapaStores.class);
		list = criteria.list();
		ActionContext.getContext().put("list", list);
		return "success";
//		if (accept() == false) {
//			// logger.debug("user-agent = " +
//			// ServletActionContext.getRequest().getHeader("user-agent"));
//			throw new RuntimeException("Please use Firefox !");
//		}
//
//		Criteria<Users> criteria = new Criteria(Users.class);
//		criteria.and(Restrictions.eq(Users.Account, userId));
//		criteria.and(Restrictions.eq(Users.Password, MD5.digest(passWord)));
//		user = criteria.get();
//		if (user != null) {
//			logger.debug("############login success#########");
//			HttpServletRequest req = ServletActionContext.getRequest();
//			SessionMgr.login(req, user);
//			this.session.put("User", user);
//			return "success";
//		}
//
//		logger.debug("############login failed#########");
//		return "fail";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
