CREATE TABLE USER_INFO(
 USER_NO INT PRIMARY KEY AUTO_INCREMENT,
 ID VARCHAR(50) UNIQUE NOT NULL,
 PASSWORD VARCHAR(300) NOT NULL,
 NAME VARCHAR(50) NOT NULL,
 PHONE VARCHAR(50),
 EMAIL VARCHAR(100),
 DEPT_NAME VARCHAR(50), -- 국내팀, 해외팀, 예약팀
 POSITION VARCHAR(50)    -- 사원, 대리, 과장
);


CREATE TABLE PRODUCT(
  PRODUCT_SEQ INT AUTO_INCREMENT PRIMARY KEY, -- 상품 고유 ID
    PRODUCT_NAME VARCHAR(100) NOT NULL, -- 상품명
    PRODUCT_NO INT NOT NULL, -- 상품코드
    STATUS VARCHAR(20), -- 상품상태 --(예약가능, 출발가능, 견적가능, 예약마감)
    product_structure VARCHAR(50), -- 상품구성
    currency VARCHAR(10), -- 통화
    PRICE_ADULT INT, -- 성인 가격
    PRICE_CHILD INT, -- 아동 가격
    PRICE_INFANT INT, -- 유아 가격
    days VARCHAR(255), -- 예약가능요일 (예: 'mon,tue,wed')
    datechoice VARCHAR(50), -- 예약일 선택제한
	START_DATE DATE, -- 시작일
	END_DATE DATE, -- 종료일
    leader TEXT, -- 인솔자
    guide TEXT, -- 가이드
    min_people INT, -- 최소출발인원
    short_Desc TEXT, -- 간략설명
    main_image VARCHAR(255), -- 대표 이미지 (파일명 또는 경로)
    detail_image VARCHAR(255), -- 상세 이미지 (파일명 또는 경로)
    detail_Desc TEXT, -- 상세설명
    admin_memo TEXT, -- 관리자 메모
    CREATE_USER_ID VARCHAR(30), -- 저장자
    CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 저장한 시간
    UPDATE_USER_ID VARCHAR(30), -- 수정자
    UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 수정한 시간
	PROJECT_ID INT

);

 SET FOREIGN_KEY_CHECKS=0;
 SET FOREIGN_KEY_CHECKS=1;

select * from product;
select * from user_info;

DELETE FROM user_info WHERE USER_NO = 1;


CREATE TABLE BOOKING(
 BOOKING_NO INT AUTO_INCREMENT PRIMARY KEY,
 ADULT_COUNT INT,                   -- 성인 인원수
 CHILD_COUNT INT,                   -- 아동 인원수
 INFANT_COUNT INT,                  -- 유아 인원수
 -- TOTAL_AMOUNT INT,                   -- 총 금액 
 PAYMENT_STATUS VARCHAR(20) CHECK(PAYMENT_STATUS IN ('대기', '완료')),
 BOOKING_STATUS VARCHAR(20) CHECK(BOOKING_STATUS IN ('예약', '완료', '취소')),
 CREATE_DATE DATETIME DEFAULT (CURRENT_TIMESTAMP),
 CUSTOMER_NO INT,
 PRODUCT_NO INT
);
SET FOREIGN_KEY_CHECKS=0;
SET FOREIGN_KEY_CHECKS=1;


CREATE TABLE SCHEDULE(
 SCHEDULE_NO INT AUTO_INCREMENT PRIMARY KEY,
 TITLE VARCHAR(100) NOT NULL,
 START_DATE DATETIME,
 END_DATE DATETIME,
 LOCATION VARCHAR(100),
 SCHEDULE_TYPE VARCHAR(30),          -- 회의, 고객미팅, 현지답사
 USER_NO INT                         -- 담당자 FK user_info
);
CREATE TABLE CUSTOMER(
 CUSTOMER_NO INT AUTO_INCREMENT PRIMARY KEY,
 NAME VARCHAR(100) NOT NULL,
 PHONE VARCHAR(20) NOT NULL,
 EMAIL VARCHAR(100),
 VIP_LEVEL VARCHAR(20) DEFAULT '일반', -- 일반, VIP
 USER_NO INT                        -- 담당 직원 FK user_info
);
CREATE TABLE CUSTOMER_INQUIRY(
 INQUIRY_NO INT AUTO_INCREMENT PRIMARY KEY,
 CUSTOMER_NO INT,
 TITLE VARCHAR(100),
 CONTENT TEXT,
 STATUS VARCHAR(20) CHECK(STATUS IN ('접수', '처리중', '완료')),
 CREATE_DATE DATETIME DEFAULT (CURRENT_TIMESTAMP),
 USER_NO INT                -- 담당 직원 FK user_info
);
CREATE TABLE project (
    project_id     INT AUTO_INCREMENT PRIMARY KEY, -- 프로젝트 고유번호
    project_name   VARCHAR(100) NOT NULL,          -- 프로젝트명 (예: 일본 봄맞이 여행 기획)
    project_type   VARCHAR(50),                    -- 유형 (패키지, 자유여행 등)
    status         VARCHAR(30) CHECK(STATUS IN ('기획중', '진행중', '완료')),                    -- 상태 (기획중, 진행중, 완료 등)
    start_date     DATE,                           -- 프로젝트 시작일
    end_date       DATE,                           -- 종료일
    created_by     INT,                            -- 등록한 직원 user_no
    created_at     DATETIME DEFAULT CURRENT_TIMESTAMP -- 등록일시
);
CREATE TABLE project_member (
    project_id   INT NOT NULL,         -- 프로젝트 ID
    user_no  INT NOT NULL,         -- 참여 직원 user_no
    role         VARCHAR(50),          -- 역할 (PM, 가이드 등)
    join_date    DATE                 -- 참여 시작일
);
CREATE TABLE project_task (
    task_id      INT AUTO_INCREMENT PRIMARY KEY,  -- 작업 고유번호
    project_id   INT NOT NULL,                    -- 연결된 프로젝트 ID
    task_name    VARCHAR(100),                    -- 작업 이름 (예: 일정표 작성)
    assigned_to  INT,                             -- 담당자 user_no
    status       VARCHAR(30),                     -- 상태 (대기, 진행, 완료 등)
    start_date   DATE,                            -- 작업 시작일
    due_date     DATE,                            -- 마감일
    priority     VARCHAR(20)                     -- 우선순위 (낮음, 보통, 높음)
);
CREATE TABLE itinerary_plan (
    itinerary_id   INT AUTO_INCREMENT PRIMARY KEY, -- 일정 계획 ID
    project_id     INT NOT NULL,                   -- 프로젝트 ID
    day_number     INT,                            -- 여행 며칠째인지 (1일차, 2일차...)
    location       VARCHAR(100),                   -- 장소
    activity       VARCHAR(255),                   -- 활동 내용
    transportation VARCHAR(100),                   -- 이동 수단
    note           TEXT                           -- 비고/특이사항
);
CREATE TABLE project_expense (
    expense_id   INT AUTO_INCREMENT PRIMARY KEY, -- 지출 ID
    project_id   INT NOT NULL,                   -- 프로젝트 ID
    category     VARCHAR(50),                    -- 항목 (항공, 숙소, 가이드비 등)
    amount       INT,                           -- 금액
    date         DATE,                           -- 지출일
    paid_to      VARCHAR(100)                   -- 지급 대상자
);
CREATE TABLE project_risk (
    risk_id          INT AUTO_INCREMENT PRIMARY KEY, -- 리스크 ID
    project_id       INT NOT NULL,                   -- 프로젝트 ID
    risk_description TEXT,                           -- 리스크 설명
    impact_level     VARCHAR(20),                    -- 영향도 (낮음/중간/높음)
    mitigation_plan  TEXT,                           -- 대응 방안
    status           VARCHAR(30)                    -- 상태 (예: 진행중/해결)
);
CREATE TABLE project_feedback (
    feedback_id  INT AUTO_INCREMENT PRIMARY KEY,  -- 피드백 ID
    project_id   INT NOT NULL,                    -- 프로젝트 ID
    source       VARCHAR(50),                     -- 출처 (고객, 가이드, 내부)
    score        INT,                             -- 점수 (1~5)
    comment      TEXT,                            -- 의견/리뷰
    created_at   DATETIME DEFAULT CURRENT_TIMESTAMP -- 작성일
);
ALTER TABLE BOOKING ADD FOREIGN KEY (CUSTOMER_NO) REFERENCES customer(CUSTOMER_NO);
ALTER TABLE BOOKING ADD FOREIGN KEY (PACKAGE_NO) REFERENCES package(PACKAGE_NO);
ALTER TABLE SCHEDULE ADD FOREIGN KEY (USER_NO) REFERENCES user_info(USER_NO);
ALTER TABLE CUSTOMER ADD FOREIGN KEY (USER_NO) REFERENCES user_info(USER_NO);
ALTER TABLE CUSTOMER_INQUIRY ADD FOREIGN KEY (CUSTOMER_NO) REFERENCES customer(CUSTOMER_NO);
ALTER TABLE CUSTOMER_INQUIRY ADD FOREIGN KEY (USER_NO) REFERENCES user_info(USER_NO);
ALTER TABLE project ADD FOREIGN KEY (created_by) REFERENCES user_info(user_no);
ALTER TABLE project_member ADD FOREIGN KEY (project_id) REFERENCES project(project_id);
ALTER TABLE project_member ADD FOREIGN KEY (user_no) REFERENCES user_info(user_no);
ALTER TABLE project_task ADD FOREIGN KEY (project_id) REFERENCES project(project_id);
ALTER TABLE project_task ADD FOREIGN KEY (assigned_to) REFERENCES user_info(user_no);
ALTER TABLE itinerary_plan ADD FOREIGN KEY (project_id) REFERENCES project(project_id);
ALTER TABLE project_expense ADD FOREIGN KEY (project_id) REFERENCES project(project_id);
ALTER TABLE project_risk ADD FOREIGN KEY (project_id) REFERENCES project(project_id);
ALTER TABLE project_feedback ADD FOREIGN KEY (project_id) REFERENCES project(project_id);