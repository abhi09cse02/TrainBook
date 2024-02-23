package com.practise.trainbook.service;

import java.util.List;

import com.practise.trainbook.beans.HistoryBean;
import com.practise.trainbook.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
