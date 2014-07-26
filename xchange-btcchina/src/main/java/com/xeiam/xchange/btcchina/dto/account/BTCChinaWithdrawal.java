/**
 * The MIT License
 * Copyright (c) 2012 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.xeiam.xchange.btcchina.dto.account;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Joe Zhou
 */
public class BTCChinaWithdrawal {

  private final long id;
  private final String address;
  private final String currency;
  private final BigDecimal amount;
  private final long date;
  private final String transaction;
  private final String status;

  public BTCChinaWithdrawal(
      @JsonProperty("id") long id,
      @JsonProperty("address") String address,
      @JsonProperty("currency") String currency,
      @JsonProperty("amount") BigDecimal amount,
      @JsonProperty("date") long date,
      @JsonProperty("transaction") String transaction,
      @JsonProperty("status") String status) {
    this.id = id;
    this.address = address;
    this.currency = currency;
    this.amount = amount;
    this.date = date;
    this.transaction = transaction;
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public String getAddress() {
    return address;
  }

  public String getCurrency() {
    return currency;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public long getDate() {
    return date;
  }

  public String getTransaction() {
    return transaction;
  }

  public String getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}
