package com.crio.warmup.stock;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Trade {
  
  @JsonProperty("symbol")
  public String symbol;
  @JsonProperty("quantity")
  public int quantity;
  @JsonProperty("tradeType")
  public String tradeType;
  @JsonProperty("purchaseDate")
  public String purchaseDate;


  
  public Trade() {
  }
  
  public Trade(String symbol, int quantity,String tradeType, String purchaseDate) {
    this.symbol = symbol;
    this.quantity = quantity;
    this.tradeType = tradeType;
    this.purchaseDate = purchaseDate;
  }

  @Override
  public String toString() {
    return "Trade [purchaseDate=" + purchaseDate + ", quantity=" + quantity + ", symbol=" + symbol + ", tradeType=" + tradeType + "]";
  }
}

