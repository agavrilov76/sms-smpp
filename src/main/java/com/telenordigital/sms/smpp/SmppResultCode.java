package com.telenordigital.sms.smpp;

public enum SmppResultCode {
  SUCCESS,
  INVALID_REQUEST,
  INVALID_USER,
  BARRED_USER,
  GENERAL_FAILURE,
  RETRIABLE_ERROR,
  RETRIABLE_ERROR_ROUTE_DOWN,
  INVALID_SENDER,
  SUBSCRIBER_ABSENT
}
