select * from booking WHERE PRODUCT_No = '11';
select * from booking WHERE PRODUCT_Name = '프랑스 파리 4박 5일 자유여행';
SELECT * FROM booking;
SELECT * FROM user_info WHERE USER_NO = 72;


UPDATE booking SET  PRODUCT_Name = '스페인 바르셀로나 패키지여행 5박 6일' WHERE PRODUCT_No = '1005';

SELECT * FROM user_info ;
SELECT * FROM PRODUCT ;
DELETE FROM PRODUCT;

SELECT status FROM PRODUCT WHERE product_no = 1001;

SELECT product_no, update_user_id, CREATE_USER_ID FROM product WHERE product_no = 1002;

SELECT 
    booking_no, product_no, booking_status,
    adult_count, child_count, infant_count
FROM booking
WHERE product_no = 1007;


SHOW TRIGGERS LIKE 'booking';
SHOW PROCEDURE STATUS WHERE NAME = 'update_product_status';

INSERT INTO PRODUCT (
    PRODUCT_NAME, PRODUCT_NO, status, product_structure, currency, 
    PRICE_ADULT, PRICE_CHILD, PRICE_INFANT,
    START_DATE, END_DATE, leader, guide, min_people, max_people, short_Desc,
    main_image, detail_image, detail_Desc, admin_memo, CREATE_USER_ID, CREATE_DATE, PROJECT_ID
)
VALUES
('프랑스 파리 자유여행 4박 5일', 1001, '예약가능', '자유여행', 'EUR', 1500, 1200, 800, '2025-08-05', '2025-08-10', 'Jean Dupont', 'Marie Curie', 1, 20, '파리 자유여행 4박 5일 패키지', 'paris_main.jpg', 'paris_detail.jpg', '파리 자유여행 상세 설명', '메모 없음', 72, NOW(), 1),
('일본 오사카 자유여행 3박 4일', 1002, '예약가능', '자유여행', 'JPY', 900, 700, 500, '2025-09-10', '2025-09-13', 'Yuki Tanaka', 'Ken Watanabe', 2, 25, '오사카 가족여행 패키지', 'osaka_main.jpg', 'osaka_detail.jpg', '오사카 상세 설명', '메모 없음', 72, NOW(), 2),
('미국 뉴욕 패키지여행 5박 6일', 1003, '예약가능', '패키지여행', 'USD', 2000, 1600, 1000, '2025-10-01', '2025-10-06', 'John Smith', 'Emily Johnson', 3, 30, '뉴욕 투어 가이드 포함', 'ny_main.jpg', 'ny_detail.jpg', '뉴욕 상세 설명', '메모 없음', 72, NOW(), 3),
('대한민국 제주도 자유여행 3박 4일', 1004, '예약가능', '자유여행', 'KRW', 500, 400, 300, '2025-08-20', '2025-08-23', 'Kim Minsoo', 'Lee Jieun', 1, 15, '제주도 3박 힐링 자유여행', 'jeju_main.jpg', 'jeju_detail.jpg', '제주도 상세 설명', '메모 없음', 72, NOW(), 4),
('스페인 바르셀로나 패키지여행 5박 6일', 1005, '예약가능', '패키지여행', 'EUR', 1300, 1000, 700, '2025-09-15', '2025-09-20', 'Carlos Ruiz', 'Lucia Gomez', 2, 18, '바르셀로나 미술관 투어', 'barcelona_main.jpg', 'barcelona_detail.jpg', '미술관 상세 설명', '메모 없음', 72, NOW(), 5),
('중국 베이징 패키지여행 5박 6일', 1006, '예약가능', '패키지여행', 'KRW', 700, 500, 300, '2025-10-10', '2025-10-15', 'Wang Wei', 'Li Na', 3, 25, '베이징 역사 명소 투어', 'beijing_main.jpg', 'beijing_detail.jpg', '베이징 상세 설명', '메모 없음', 72, NOW(), 6),
('태국 방콕 자유여행 4박 5일', 1007, '예약가능', '자유여행', 'USD', 800, 600, 400, '2025-11-01', '2025-11-05', 'Anan Buran', 'Nok Supansa', 1, 20, '방콕 자유여행', 'bangkok_main.jpg', 'bangkok_detail.jpg', '방콕 상세 설명', '메모 없음', 72, NOW(), 7),
('베트남 다낭 자유여행 3박 4일', 1008, '예약가능', '자유여행', 'USD', 600, 500, 300, '2025-12-01', '2025-12-04', 'Nguyen Van A', 'Tran Thi B', 2, 22, '다낭 해변 리조트 포함', 'danang_main.jpg', 'danang_detail.jpg', '다낭 상세 설명', '메모 없음', 72, NOW(), 8),
('영국 런던 패키지여행 5박 6일', 1009, '예약가능', '패키지여행', 'GBP', 1700, 1400, 1000, '2025-09-01', '2025-09-06', 'James Brown', 'Emma Watson', 2, 25, '런던 시내 명소 투어', 'london_main.jpg', 'london_detail.jpg', '런던 상세 설명', '메모 없음', 72, NOW(), 9),
('이탈리아 로마 패키지여행 5박 6일', 1010, '예약가능', '패키지여행', 'EUR', 1600, 1300, 900, '2025-10-05', '2025-10-10', 'Marco Rossi', 'Giulia Bianchi', 2, 24, '로마 고대 역사 여행', 'rome_main.jpg', 'rome_detail.jpg', '로마 상세 설명', '메모 없음', 72, NOW(), 10),
('스위스 알프스 패키지여행 5박 6일', 1011, '예약가능', '패키지여행', 'CHF', 1800, 1500, 1100, '2025-08-15', '2025-08-20', 'Hans Müller', 'Anna Schmidt', 3, 12, '스위스 하이킹 투어', 'swiss_main.jpg', 'swiss_detail.jpg', '알프스 하이킹 설명', '메모 없음', 72, NOW(), 11),
('캐나다 밴쿠버 자유여행 5박 6일', 1012, '예약가능', '자유여행', 'CAD', 1500, 1200, 900, '2025-09-12', '2025-09-17', 'David Lee', 'Grace Park', 2, 20, '밴쿠버 자연 체험 여행', 'vancouver_main.jpg', 'vancouver_detail.jpg', '밴쿠버 설명', '메모 없음', 72, NOW(), 12),
('호주 시드니 자유여행 5박 6일', 1013, '예약가능', '자유여행', 'AUD', 1600, 1300, 1000, '2025-10-20', '2025-10-25', 'Steve Irwin', 'Nicole Kidman', 2, 18, '시드니 해양 생태 체험', 'sydney_main.jpg', 'sydney_detail.jpg', '시드니 설명', '메모 없음', 72, NOW(), 13),
('독일 베를린 패키지여행 5박 6일', 1014, '예약가능', '패키지여행', 'EUR', 1400, 1100, 800, '2025-11-05', '2025-11-10', 'Peter Weber', 'Anna Krause', 3, 22, '베를린 역사와 문화', 'berlin_main.jpg', 'berlin_detail.jpg', '베를린 설명', '메모 없음', 72, NOW(), 14),
('포르투갈 리스본 패키지여행 5박 6일', 1015, '예약가능', '패키지여행', 'EUR', 1300, 1000, 750, '2025-12-01', '2025-12-06', 'João Silva', 'Maria Fernandes', 2, 20, '리스본 도시 투어', 'lisbon_main.jpg', 'lisbon_detail.jpg', '리스본 설명', '메모 없음', 72, NOW(), 15);





DROP PROCEDURE IF EXISTS update_product_status;
commit;
SHOW CREATE TRIGGER update_product_status;

DROP TRIGGER IF EXISTS update_product_status;
DELIMITER $$
DROP TRIGGER update_product_status;
CREATE PROCEDURE update_product_status(IN p_product_no INT)
BEGIN
    DECLARE total_booked INT DEFAULT 0;
    DECLARE max_people INT DEFAULT 0;
    DECLARE min_people INT DEFAULT 0;
    DECLARE current_status VARCHAR(20);

    -- 예약확정된 인원 총합 계산
    SELECT IFNULL(SUM(adult_count + child_count + infant_count), 0)
    INTO total_booked
    FROM booking
    WHERE product_no = p_product_no;
   

    -- 상품 정보 조회
    SELECT max_people, min_people, status
    INTO productmax_people, min_people, current_status
    FROM product
    WHERE product_no = p_product_no;

    -- 예약 인원을 반영
    UPDATE product
    SET current_people = total_booked
    WHERE product_no = p_product_no;

    -- 상태 업데이트 조건 적용
    IF total_booked >= max_people THEN
        UPDATE product
        SET status = '예약마감'
        WHERE product_no = p_product_no;
    ELSEIF total_booked >= min_people THEN
        UPDATE product
        SET status = '출발가능'
        WHERE product_no = p_product_no;
    ELSE
        UPDATE product
        SET status = '예약가능'
        WHERE product_no = p_product_no;
    END IF;
END$$
DELIMITER ;



DELIMITER $$

DROP TRIGGER IF EXISTS trg_booking_update;

CREATE TRIGGER trg_booking_update
AFTER UPDATE ON booking
FOR EACH ROW
BEGIN
    -- 예약 상태, 상품 번호, 또는 인원 수 변경 시 반영
    IF OLD.booking_status != NEW.booking_status
        OR OLD.product_no != NEW.product_no
        OR OLD.adult_count != NEW.adult_count
        OR OLD.child_count != NEW.child_count
        OR OLD.infant_count != NEW.infant_count THEN

        -- 이전 상품 상태 업데이트
        IF OLD.product_no IS NOT NULL THEN
            CALL update_product_status(OLD.product_no);
        END IF;

        -- 새로운 상품 상태 업데이트
        IF NEW.product_no IS NOT NULL AND OLD.product_no != NEW.product_no THEN
            CALL update_product_status(NEW.product_no);
        END IF;
    END IF;
END$$

DELIMITER ;


DROP TRIGGER IF EXISTS trg_booking_insert;

DELIMITER $$

CREATE TRIGGER trg_booking_insert
AFTER INSERT ON booking
FOR EACH ROW
BEGIN
    IF NEW.booking_status = '예약대기' 
    THEN
        CALL update_product_status(NEW.product_no);
    END IF;
END$$

DELIMITER ;


DROP TRIGGER IF EXISTS trg_product_update;


 
