package hello.core.order;


// 클라이언트가 주문 서비스 역할에게 ,id, 상품명, 상품 가격을 넘기면 주문결과가 반환 되는 부분이자 역할
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
