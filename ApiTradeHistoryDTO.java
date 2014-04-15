package com.example.trading;

public class ApiTradeHistoryDTO 
{
	public int OrderId;
	public int OpeningOrderIds;
	public int MarketId;
	public String MarketName;
	public String Direction;
	public float OriginalQuantity;
	public float Quantity;
	public float Price;
	public int TradingAccountId;
	public String Currency;
	public float RealisedPnl;
	public String RealisedPnlCurrency;
	public String LastChangedDateTimeUtc;
	public String ExecutedDateTimeUtc;

}
