select * from product WHERE PRODUCT_NAME = '파리 5일 패키지';

 SELECT * FROM PRODUCT WHERE PRODUCT_NO = 1;

INSERT INTO PRODUCT (
    PRODUCT_NAME, PRODUCT_NO, STATUS, product_structure, currency, PRICE_ADULT, PRICE_CHILD, PRICE_INFANT,
    days, datechoice, START_DATE, END_DATE, leader, guide, min_people, short_Desc,
    main_image, detail_image, detail_Desc, admin_memo, CREATE_USER_ID, CREATE_DATE, UPDATE_USER_ID, UPDATE_DATE, PROJECT_ID
) VALUES
('파리 5일 패키지', 1, '예약가능', '패키지 여행', 'KRW', 1800000, 1350000, 900000, 'mon,wed,fri', '선택가능', '2025-09-01', '2025-09-05', 'Jean', 'Pierre', 10, '에펠탑, 루브르 박물관 투어', 'paris_main.jpg', 'paris_detail.jpg', '파리 유명 명소 및 미식 체험 포함', '인기 상품', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 201),
('로마 4일 패키지', 2, '예약가능', '패키지 여행', 'KRW', 1500000, 1125000, 750000, 'tue,thu,sat', '선택가능', '2025-09-03', '2025-09-06', 'Luca', 'Maria', 8, '콜로세움, 바티칸 투어', 'rome_main.jpg', 'rome_detail.jpg', '로마 고대 유적과 음식 체험', '추천 상품', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 202),
('런던 5일 패키지', 3, '예약가능', '패키지 여행', 'USD', 1300, 950, 650, 'mon,wed,fri', '선택가능', '2025-09-05', '2025-09-09', 'Oliver', 'Emma', 10, '버킹엄 궁전, 대영박물관 투어', 'london_main.jpg', 'london_detail.jpg', '런던 주요 관광지와 전통 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 203),
('바르셀로나 4일 패키지', 4, '예약가능', '패키지 여행', 'USD', 1100, 800, 550, 'tue,thu,sat', '선택가능', '2025-09-10', '2025-09-13', 'Carlos', 'Sofia', 8, '사그라다 파밀리아, 구엘공원 투어', 'barcelona_main.jpg', 'barcelona_detail.jpg', '가우디 건축물 탐방 및 음식 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 204),
('뉴욕 5일 패키지', 5, '예약가능', '패키지 여행', 'USD', 1500, 1100, 700, 'mon,wed,fri', '선택가능', '2025-09-12', '2025-09-16', 'John', 'Emma', 10, '자유의 여신상, 센트럴 파크 투어', 'newyork_main.jpg', 'newyork_detail.jpg', '뉴욕 주요 관광지 및 브로드웨이 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 205),
('도쿄 3일 패키지', 6, '예약가능', '패키지 여행', 'JPY', 80000, 60000, 30000, 'mon,tue,wed,thu,fri', '선택가능', '2025-09-15', '2025-09-17', 'Takashi', 'Yuki', 6, '도쿄 타워, 아사쿠사 투어', 'tokyo_main.jpg', 'tokyo_detail.jpg', '도쿄 주요 관광지 및 일본 전통 문화 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 206),
('교토 4일 패키지', 7, '예약가능', '패키지 여행', 'JPY', 90000, 65000, 35000, 'tue,thu,sat', '선택가능', '2025-09-18', '2025-09-21', 'Hiroshi', 'Mika', 6, '금각사, 기온 거리 투어', 'kyoto_main.jpg', 'kyoto_detail.jpg', '교토의 전통 문화와 사찰 탐방', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 207),
('방콕 5일 패키지', 8, '예약가능', '패키지 여행', 'KRW', 600000, 400000, 250000, 'mon,wed,fri', '선택가능', '2025-09-20', '2025-09-24', 'Somsak', 'Anong', 8, '왕궁, 짜오프라야 강 투어', 'bangkok_main.jpg', 'bangkok_detail.jpg', '방콕 유명 명소와 수상시장 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 208),
('싱가포르 4일 패키지', 9, '예약가능', '패키지 여행', 'USD', 1200, 900, 600, 'tue,thu,sat', '선택가능', '2025-09-22', '2025-09-25', 'Lee', 'Tan', 6, '마리나 베이 샌즈, 가든스 바이 더 베이 투어', 'singapore_main.jpg', 'singapore_detail.jpg', '싱가포르 주요 관광지 및 음식 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 209),
('홍콩 3일 패키지', 10, '예약가능', '패키지 여행', 'USD', 1000, 700, 500, 'mon,wed,fri', '선택가능', '2025-09-25', '2025-09-27', 'Chan', 'Li', 6, '빅토리아 피크, 스타의 거리 투어', 'hongkong_main.jpg', 'hongkong_detail.jpg', '홍콩 관광지 및 쇼핑 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 210),
('시드니 5일 패키지', 11, '예약가능', '패키지 여행', 'USD', 1400, 1000, 700, 'mon,wed,fri', '선택가능', '2025-09-28', '2025-10-02', 'James', 'Olivia', 8, '오페라 하우스, 본다이 비치 투어', 'sydney_main.jpg', 'sydney_detail.jpg', '시드니 주요 관광지 및 해변 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 211),
('멜버른 4일 패키지', 12, '예약가능', '패키지 여행', 'USD', 1300, 900, 600, 'tue,thu,sat', '선택가능', '2025-10-03', '2025-10-06', 'William', 'Sophia', 6, '페더레이션 광장, 야라 강 투어', 'melbourne_main.jpg', 'melbourne_detail.jpg', '멜버른 주요 관광지 탐방 및 음식 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 212),
('로스앤젤레스 5일 패키지', 13, '예약가능', '패키지 여행', 'USD', 1500, 1100, 700, 'mon,wed,fri', '선택가능', '2025-10-05', '2025-10-09', 'Michael', 'Emma', 10, '할리우드, 산타모니카 투어', 'la_main.jpg', 'la_detail.jpg', 'LA 대표 관광지 및 쇼핑 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 213),
('라스베이거스 4일 패키지', 14, '예약가능', '패키지 여행', 'USD', 1400, 1000, 700, 'tue,thu,sat', '선택가능', '2025-10-10', '2025-10-13', 'David', 'Linda', 8, '라스베이거스 스트립, 카지노 체험', 'vegas_main.jpg', 'vegas_detail.jpg', '카지노 및 유명 호텔 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 214),
('샌프란시스코 5일 패키지', 15, '예약가능', '패키지 여행', 'USD', 1500, 1100, 700, 'mon,wed,fri', '선택가능', '2025-10-15', '2025-10-19', 'Daniel', 'Grace', 8, '금문교, 알카트라즈 섬 투어', 'sf_main.jpg', 'sf_detail.jpg', '샌프란시스코 주요 관광지 및 음식 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 215),
('하와이 5일 패키지', 16, '예약가능', '패키지 여행', 'USD', 1600, 1200, 800, 'mon,wed,fri', '선택가능', '2025-10-20', '2025-10-24', 'Kimo', 'Leilani', 8, '와이키키 해변, 다이아몬드 헤드 투어', 'hawaii_main.jpg', 'hawaii_detail.jpg', '하와이 해변과 문화 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 216),
('오사카 4일 패키지', 17, '예약가능', '패키지 여행', 'JPY', 85000, 60000, 35000, 'tue,thu,sat', '선택가능', '2025-10-22', '2025-10-25', 'Kenji', 'Aiko', 6, '오사카성, 도톤보리 투어', 'osaka_main.jpg', 'osaka_detail.jpg', '오사카 관광지 및 음식 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 217),
('후쿠오카 3일 패키지', 18, '예약가능', '패키지 여행', 'JPY', 75000, 55000, 30000, 'mon,wed,fri', '선택가능', '2025-10-25', '2025-10-27', 'Hiro', 'Sakura', 6, '하카타, 텐진 투어', 'fukuoka_main.jpg', 'fukuoka_detail.jpg', '후쿠오카 지역 관광 및 쇼핑 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 218),
('싱가포르 5일 패키지', 19, '예약가능', '패키지 여행', 'USD', 1300, 950, 650, 'mon,wed,fri', '선택가능', '2025-10-28', '2025-11-01', 'Lee', 'Tan', 8, '센토사, 마리나베이 샌즈 투어', 'singapore2_main.jpg', 'singapore2_detail.jpg', '싱가포르 관광과 쇼핑 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 219),
('홍콩 4일 패키지', 20, '예약가능', '패키지 여행', 'USD', 1100, 800, 550, 'tue,thu,sat', '선택가능', '2025-11-03', '2025-11-06', 'Chan', 'Li', 6, '디즈니랜드, 빅토리아 피크 투어', 'hongkong2_main.jpg', 'hongkong2_detail.jpg', '홍콩 관광지 및 쇼핑 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 220),
('방콕 4일 패키지', 21, '예약가능', '패키지 여행', 'KRW', 650000, 450000, 300000, 'mon,wed,fri', '선택가능', '2025-11-05', '2025-11-08', 'Somsak', 'Anong', 8, '짜오프라야 강, 수상시장 투어', 'bangkok2_main.jpg', 'bangkok2_detail.jpg', '방콕 주요 관광지 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 221),
('쿠알라룸푸르 4일 패키지', 22, '예약가능', '패키지 여행', 'USD', 1000, 700, 500, 'tue,thu,sat', '선택가능', '2025-11-10', '2025-11-13', 'Ahmad', 'Siti', 6, '페트로나스 트윈타워, 바투 동굴 투어', 'kuala_main.jpg', 'kuala_detail.jpg', '말레이시아 주요 관광지 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 222),
('발리 5일 패키지', 23, '예약가능', '패키지 여행', 'KRW', 700000, 500000, 300000, 'mon,wed,fri', '선택가능', '2025-11-15', '2025-11-19', 'Ketut', 'Made', 8, '울루와투 사원, 스미냑 투어', 'bali_main.jpg', 'bali_detail.jpg', '발리 해변과 문화 체험 포함', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 223),
('파리 7일 패키지', 24, '예약가능', '패키지 여행', 'KRW', 2500000, 1800000, 1200000, 'mon,wed,fri', '선택가능', '2025-11-20', '2025-11-26', 'Jean', 'Pierre', 10, '루브르, 에펠탑, 세느강 크루즈', 'paris2_main.jpg', 'paris2_detail.jpg', '파리 관광지 풀패키지', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 224),
('로마 5일 패키지', 25, '예약가능', '패키지 여행', 'KRW', 1800000, 1350000, 900000, 'tue,thu,sat', '선택가능', '2025-11-22', '2025-11-26', 'Luca', 'Maria', 8, '콜로세움, 바티칸, 트레비 분수 투어', 'rome2_main.jpg', 'rome2_detail.jpg', '로마 주요 관광지 체험', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 225),
('런던 6일 패키지', 26, '예약가능', '패키지 여행', 'USD', 1600, 1200, 800, 'mon,wed,fri', '선택가능', '2025-11-25', '2025-11-30', 'Oliver', 'Emma', 10, '런던 타워, 대영박물관, 버킹엄 궁전', 'london2_main.jpg', 'london2_detail.jpg', '런던 관광지 풀패키지', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 226),
('뉴욕 6일 패키지', 27, '예약가능', '패키지 여행', 'USD', 1700, 1300, 900, 'mon,wed,fri', '선택가능', '2025-11-28', '2025-12-03', 'John', 'Emma', 10, '자유의 여신상, 센트럴 파크, 브로드웨이', 'newyork2_main.jpg', 'newyork2_detail.jpg', '뉴욕 관광지 풀패키지', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 227),
('도쿄 4일 패키지', 28, '예약가능', '패키지 여행', 'JPY', 90000, 65000, 35000, 'mon,wed,fri', '선택가능', '2025-12-01', '2025-12-04', 'Takashi', 'Yuki', 6, '도쿄 타워, 아사쿠사, 오다이바 투어', 'tokyo2_main.jpg', 'tokyo2_detail.jpg', '도쿄 관광지 풀패키지', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 228),
('교토 5일 패키지', 29, '예약가능', '패키지 여행', 'JPY', 100000, 70000, 40000, 'tue,thu,sat', '선택가능', '2025-12-05', '2025-12-09', 'Hiroshi', 'Mika', 6, '금각사, 은각사, 기온 거리', 'kyoto2_main.jpg', 'kyoto2_detail.jpg', '교토 전통 관광지 풀패키지', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 229),
('싱가포르 5일 패키지', 30, '예약가능', '패키지 여행', 'USD', 1400, 1000, 700, 'mon,wed,fri', '선택가능', '2025-12-10', '2025-12-14', 'Lee', 'Tan', 8, '센토사, 마리나베이 샌즈, 가든스 바이 더 베이', 'singapore3_main.jpg', 'singapore3_detail.jpg', '싱가포르 관광지 풀패키지', '', 'admin', CURRENT_TIMESTAMP, 'admin', CURRENT_TIMESTAMP, 230);




 SELECT * FROM PRODUCT;
 
 /* '예약가능', '출발가능', '예약마감', '시즌종료' */
 UPDATE PRODUCT SET STATUS = '예약마감' WHERE PRODUCT_SEQ IN ('3','6','10','23','24','30');
 UPDATE PRODUCT SET STATUS = '출발가능' WHERE PRODUCT_SEQ IN ('2','5','11','14','16');
 UPDATE PRODUCT SET STATUS = '시즌종료' WHERE PRODUCT_SEQ IN ('29','15');
 COMMIT;