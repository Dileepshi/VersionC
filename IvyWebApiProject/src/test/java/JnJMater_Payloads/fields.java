package JnJMater_Payloads;

public class fields {

	private String Branch_Code;
	private String Retailer_Code;
	private String User_Code;
	private String Return_No;
	private String Invoice_No;
	private String Return_Date;
	private String SKU_Code;
	private String UOM;
	private String Reason;
	private String Return_Qty;
	private String SKU_Price;
	private String Line_Value;
	private String Total_Amount;
	private String Doc_category;

	public fields(String bcode, String rcode, String ucode, String retunrno, String invoice, String returndate,
			String skucode, String uom, String reason, String returnqty, String skuprice, String linevalue,
			String totalamount, String docca) {

		this.Branch_Code = bcode;
		this.Retailer_Code = rcode;
		this.User_Code = ucode;
		this.Return_No = retunrno;
		this.Invoice_No = invoice;
		this.Return_Date = returndate;
		this.SKU_Code = skucode;
		this.UOM = uom;
		this.Reason = reason;
		this.Return_Qty = returnqty;
		this.SKU_Price = skuprice;
		this.Line_Value = linevalue;
		this.Total_Amount = totalamount;
		this.Doc_category = docca;

	}

	public String getBranch_Code() {
		return Branch_Code;
	}

	public void setBranch_Code(String branch_Code) {
		Branch_Code = branch_Code;
	}

	public String getRetailer_Code() {
		return Retailer_Code;
	}

	public void setRetailer_Code(String retailer_Code) {
		Retailer_Code = retailer_Code;
	}

	public String getUser_Code() {
		return User_Code;
	}

	public void setUser_Code(String user_Code) {
		User_Code = user_Code;
	}

	public String getReturn_No() {
		return Return_No;
	}

	public void setReturn_No(String return_No) {
		Return_No = return_No;
	}

	public String getInvoice_No() {
		return Invoice_No;
	}

	public void setInvoice_No(String invoice_No) {
		Invoice_No = invoice_No;
	}

	public String getReturn_Date() {
		return Return_Date;
	}

	public void setReturn_Date(String return_Date) {
		Return_Date = return_Date;
	}

	public String getSKU_Code() {
		return SKU_Code;
	}

	public void setSKU_Code(String sKU_Code) {
		SKU_Code = sKU_Code;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getReturn_Qty() {
		return Return_Qty;
	}

	public void setReturn_Qty(String return_Qty) {
		Return_Qty = return_Qty;
	}

	public String getSKU_Price() {
		return SKU_Price;
	}

	public void setSKU_Price(String sKU_Price) {
		SKU_Price = sKU_Price;
	}

	public String getLine_Value() {
		return Line_Value;
	}

	public void setLine_Value(String line_Value) {
		Line_Value = line_Value;
	}

	public String getTotal_Amount() {
		return Total_Amount;
	}

	public void setTotal_Amount(String total_Amount) {
		Total_Amount = total_Amount;
	}

	public String getDoc_category() {
		return Doc_category;
	}

	public void setDoc_category(String doc_category) {
		Doc_category = doc_category;
	}

}
