package group.b.electronicstore.service;

import java.util.List;

import group.b.electronicstore.model.OrderDetail;

public interface OrderDetailService {

	List<OrderDetail> getOrddetailByOrderId(long id);

	OrderDetail createOrderDetail(OrderDetail orddetail);

	OrderDetail updateOrderDetail(OrderDetail orddetail, long id);

	void deleteOrderDetail(long id);

	void autoUpdateOrd(OrderDetail orddetail);
	
}
