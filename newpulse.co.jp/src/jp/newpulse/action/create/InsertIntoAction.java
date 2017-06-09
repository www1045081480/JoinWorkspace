package jp.newpulse.action.create;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.np.base.db.TxMgr;
import com.np.base.orm.Criteria;
import com.np.order.models.NapaStores;

import jp.newpulse.action.BaseJsonAction;

@SuppressWarnings("serial")
public class InsertIntoAction extends BaseJsonAction  {
	private static Log logger = LogFactory.getLog(InsertIntoAction.class);
	private String NapaId;
	private String Security;
	private String Cname;
	private String SubCName;
	private String Address;
	private NapaStores napastores;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		
		logger.debug("############insert#########");
		Criteria<NapaStores> criteria = new Criteria(NapaStores.class);
		System.out.println(NapaId);
		System.out.println(Security);
		System.out.println(Cname);
		System.out.println(SubCName);
		System.out.println(Address);
		napastores = new NapaStores();
		napastores.setNapaId(NapaId);
		napastores.setSecurity(Security);
		napastores.setCname(Cname);
		napastores.setSubCName(SubCName);
		napastores.setAddress(Address);
		TxMgr.insert(napastores);
		Map result = new HashMap();
		result.put("success", "success");
		response(result);
		return "success";
	}

	public String getNapaId() {
		return NapaId;
	}

	public void setNapaId(String napaId) {
		NapaId = napaId;
	}

	public String getSecurity() {
		return Security;
	}

	public void setSecurity(String security) {
		Security = security;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getSubCName() {
		return SubCName;
	}

	public void setSubCName(String subCName) {
		SubCName = subCName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public NapaStores getNapastores() {
		return napastores;
	}

	public void setNapastores(NapaStores napastores) {
		this.napastores = napastores;
	}

	public static Log getLogger() {
		return logger;
	}

	public static void setLogger(Log logger) {
		InsertIntoAction.logger = logger;
	}

}
