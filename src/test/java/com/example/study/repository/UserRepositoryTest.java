//package com.example.study.repository;
//
//import com.example.study.StudyApplicationTests;
//import com.example.study.model.entity.Item;
//import com.example.study.model.entity.User;
//import org.hibernate.annotations.NotFound;
//import org.hibernate.annotations.NotFoundAction;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.transaction.Transactional;
//import java.time.LocalDateTime;
//import java.util.Optional;
//
//public class UserRepositoryTest extends StudyApplicationTests {
//
//    // Dependency Injection (DI)
//    // Spring이 객체를 직접 관리
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void create() {
//        String account = "Test03";
//        String password = "Test03";
//        String status = "REGISTERED";
//        String email = "Test03@gmail.com";
//        String phoneNumber = "010-1111-3333";
//        LocalDateTime registeredAt = LocalDateTime.now();
//
//        User user = new User();
//        user.setAccount(account);
//        user.setPassword(password);
//        user.setStatus(status);
//        user.setEmail(email);
//        user.setPhoneNumber(phoneNumber);
//        user.setRegisteredAt(registeredAt);
//
////        Lombok Builder
//        User u = User.builder()
//                .account(account)
//                .password(password)
//                .status(status)
//                .email(email)
//                .build();
//
//
//        User newUser = userRepository.save(user);
//        Assertions.assertNotNull(newUser);
//    }
//
//    @Test
//    @Transactional
//    public void read() {
//        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-1111-2222");
//
//        // chain
//        user
//                .setEmail("")
//                .setPhoneNumber("")
//                .setStatus("");
//
//        if (user != null) {
//            user.getOrderGroupList().stream().forEach(orderGroup -> {
//                System.out.println("-------------------주문묶음-------------------");
//                System.out.println("수령지 : " + orderGroup.getRevAddress());
//                System.out.println("총금액 : " + orderGroup.getTotalPrice());
//                System.out.println("총수량 : " + orderGroup.getTotalQuantity());
//
//                System.out.println("-------------------주문상세-------------------");
//
//                orderGroup.getOrderDetailList().forEach(orderDetail -> {
//                    System.out.println("파트너사의 이름 : " + orderDetail.getItem().getPartner().getName());
//                    System.out.println("파트너사의 카테고리 : " + orderDetail.getItem().getPartner().getCategory().getTitle());
//                    System.out.println("주문의 상품 : " + orderDetail.getItem().getName());
//                    System.out.println("고객센터 번호 : " + orderDetail.getItem().getPartner().getCallCenter());
//                    System.out.println("주문의 상태 : " + orderDetail.getStatus());
//                    System.out.println("도착예정일자 : " + orderDetail.getArrivalDate());
//                });
//            });
//
//        }
//    }
//
//    @Test
//    @Transactional
//    public void update() {
//        Optional<User> user = userRepository.findById(2L);
//
//        user.ifPresent(selectUser -> {
//            selectUser.setAccount("pppp");
//            selectUser.setUpdatedAt(LocalDateTime.now());
//            selectUser.setUpdatedBy("update method()");
//
//            userRepository.save(selectUser);
//        });
//    }
//
//    @Test
//    @Transactional
//    public void delete() {
//        Optional<User> user = userRepository.findById(3L);
//
//        Assertions.assertTrue(user.isPresent());
//
//        user.ifPresent(selectUser -> {
//            userRepository.delete(selectUser);
//        });
//
//        Optional<User> deleteUser = userRepository.findById(2L);
//
//        Assertions.assertFalse(deleteUser.isPresent());
//    }
//
//}
