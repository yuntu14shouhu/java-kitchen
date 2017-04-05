CREATE TABLE USERS (
  ID VARCHAR(32) NOT NULL,
  USER_NAME VARCHAR (20),
  PASSWORD varchar(50),
  NICK_NAME VARCHAR (20),
  SALT VARCHAR(100),
  STATUS INT,
  SEX VARCHAR(10),
  AGE INT,
  CREATE_TIME TIMESTAMP(6),
  REMARK VARCHAR(300),
  CONTACTS VARCHAR(100),
  PRIMARY KEY (ID)
);
COMMENT ON COLUMN USERS.ID IS 'ID';
COMMENT ON COLUMN USERS.USER_NAME IS '用户姓名';
COMMENT ON COLUMN USERS.PASSWORD IS '用户密码';
COMMENT ON COLUMN USERS.NICK_NAME IS '昵称';
COMMENT ON COLUMN USERS.STATUS IS '用户状态';
COMMENT ON COLUMN USERS.SEX IS '用户性别';
COMMENT ON COLUMN USERS.AGE IS '用户年龄';
COMMENT ON COLUMN USERS.REMARK IS '备注信息';
COMMENT ON COLUMN USERS.CONTACTS IS '联系方式';

CREATE TABLE PRODUCT (
  ID VARCHAR (32) NOT NULL ,
  PUTAWAY_DATE TIMESTAMP(6),
  KINDS VARCHAR (50),
  PRODUCT_NAME VARCHAR (50),
  PRODUCT_IMAGE_URL VARCHAR (1000),
  STATUS INT,
  PRODUCT_TYPES VARCHAR (100),
  PRODUCER VARCHAR (50),
  ADDRESS VARCHAR(200),
  DESCRIBED VARCHAR(255),
  PRODUCTION_DATE TIMESTAMP(6),
  PRICE NUMBER(10,2),
  DISCOUNT_PRICE NUMBER(10,2),
  IS_DISCOUNT INT,
  LIMIT_NUMBER INT,
  KIND_NUMBER INT DEFAULT 1,
  START_DATE TIMESTAMP(6),
  END_DATE TIMESTAMP(6),
  CARRIAGE NUMBER(10,2),
  IS_GROUP_BUY INT,
  GROUP_BUY_PRICE NUMBER(10,2),
  GROUP_BUY_PERSON_NUMBER INT,
  START_GROUP_BUY_DATE TIMESTAMP(6),
  END_GROUP_BUY_DATE TIMESTAMP(6),
  KEY_CLASS VARCHAR(40),
  BIG_KEY_CLASS VARCHAR(40),
  KEYWORD VARCHAR (32),
  PRIMARY KEY (ID)
);
COMMENT ON COLUMN PRODUCT.ID IS 'id';
COMMENT ON COLUMN PRODUCT.PUTAWAY_DATE IS '上架日期';
COMMENT ON COLUMN PRODUCT.KINDS IS '类型';
COMMENT ON COLUMN PRODUCT.PRODUCT_NAME IS '商品名称';
COMMENT ON COLUMN PRODUCT.PRODUCT_IMAGE_URL IS '商品图片';
COMMENT ON COLUMN PRODUCT.STATUS IS '标识图片:1--主图;0--副图';
COMMENT ON COLUMN PRODUCT.PRODUCT_TYPES IS '商品型号';
COMMENT ON COLUMN PRODUCT.PRODUCER IS '生产商';
COMMENT ON COLUMN PRODUCT.ADDRESS IS '产地';
COMMENT ON COLUMN PRODUCT.DESCRIBED IS '商品描述';
COMMENT ON COLUMN PRODUCT.PRODUCTION_DATE IS '生产日期';
COMMENT ON COLUMN PRODUCT.IS_GROUP_BUY IS '是否团购';
COMMENT ON COLUMN PRODUCT.GROUP_BUY_PRICE IS '团购价格';
COMMENT ON COLUMN PRODUCT.GROUP_BUY_PERSON_NUMBER IS '几人团';
COMMENT ON COLUMN PRODUCT.START_GROUP_BUY_DATE IS '开团日期';
COMMENT ON COLUMN PRODUCT.END_GROUP_BUY_DATE IS '闭团日期';
COMMENT ON COLUMN PRODUCT.PRICE IS '商品价格';
COMMENT ON COLUMN PRODUCT.DISCOUNTPRICE IS '优惠价格';
COMMENT ON COLUMN PRODUCT.ISDISCOUNT IS '是否优惠';
COMMENT ON COLUMN PRODUCT.LIMIT_NUMBER IS '用餐人数';
COMMENT ON COLUMN PRODUCT.KIND_NUMBER IS '套餐种类，默认为1';
COMMENT ON COLUMN PRODUCT.START_DATE IS '优惠开始日期';
COMMENT ON COLUMN PRODUCT.END_DATE IS '优惠结束日期';
COMMENT ON COLUMN PRODUCT.CARRIAGE IS '运费';
COMMENT ON COLUMN PRODUCT.KEY_CLASS IS '小类别';
COMMENT ON COLUMN PRODUCT.BIG_KEY_CLASS IS '大类别';
COMMENT ON COLUMN PRODUCT.KEYWORD IS '类别名称';



CREATE TABLE SHOPPINGCART (
  ID VARCHAR(32) NOT NULL,
  USER_ID VARCHAR(32),
  PRODUCT_ID VARCHAR(32),
  STATUS INT ,
  PRODUCT_NUMBER INT ,
  PRIMARY KEY (ID)
--   KEY USER_ID (USER_ID),
--   KEY PRODUCT_ID (PRODUCT_ID),
--   CONSTRAINT USER_ID FOREIGN KEY (USER_ID) REFERENCES USERS (ID),
--   CONSTRAINT PRODUCT_ID FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT (ID)
);
COMMENT ON COLUMN SHOPPINGCART.ID IS '购物车id';
COMMENT ON COLUMN SHOPPINGCART.USER_ID IS '用户id';
COMMENT ON COLUMN SHOPPINGCART.PRODUCT_ID IS '商品id';
COMMENT ON COLUMN SHOPPINGCART.STATUS IS '状态:0--已经付款;1--未付款';
COMMENT ON COLUMN SHOPPINGCART.PRODUCT_NUMBER IS '商品数量';





---------------取消外键约束------------
CREATE TABLE "QJJ"."ADDRESS"
(
  "ID"                VARCHAR2(32) NOT NULL ENABLE,
  "USER_ID"           VARCHAR2(32),
  "CONSIGNEE_NAME"    VARCHAR2(20),
  "CONSIGNEE_PHONE"   VARCHAR2(20),
  "CONSIGNEE_ADDRESS" VARCHAR2(300),
  "DEFAULT_ADDRESS"   VARCHAR2(300),
  "IS_DEFAULT"        NUMBER(3, 0),
  "ADDRESS_TYPE"      NUMBER(3, 0),
  PRIMARY KEY ("ID")
);

CREATE TABLE "QJJ"."SHOPPINGCART"
(
  "ID"             VARCHAR2(32) NOT NULL ENABLE,
  "USER_ID_SHOP"   VARCHAR2(32),
  "PRODUCT_ID"     VARCHAR2(32),
  "STATUS"         NUMBER(3, 0),
  "PRODUCT_NUMBER" NUMBER(4, 0),
  PRIMARY KEY ("ID")
);



----------补充和修改----------

CREATE TABLE "QJJ"."CN_AND_EN"(
  CN_AND_EN_ID VARCHAR2(32),
  BIG_KEY_CLASS_EN VARCHAR2(40),
  BIG_KEY_CLASS_CN VARCHAR2(40),
  PRIMARY KEY ("CN_AND_EN_ID")
);

  DROP TABLE CN_AND_EN;

CREATE TABLE "QJJ"."SHOPPINGCART" (
  ID VARCHAR(32) NOT NULL,
  USER_ID_SHOP VARCHAR(32),
  PRODUCT_ID VARCHAR(32),
  STATUS INT ,
  PRODUCT_NUMBER INT ,
  PRIMARY KEY (ID),
  CONSTRAINT USER_ID_SHOP FOREIGN KEY (USER_ID_SHOP) REFERENCES USERS (ID),
  CONSTRAINT PRODUCT_ID FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT (ID)
);



CREATE TABLE "QJJ"."USERS"
(
  "ID"          VARCHAR2(32) NOT NULL ENABLE,
  "USER_NAME"   VARCHAR2(20),
  "PASSWORD"    VARCHAR2(250),
  "NICK_NAME"   VARCHAR2(20),
  "SALT"        VARCHAR2(100),
  "STATUS"      NUMBER(3, 0),
  "SEX"         VARCHAR2(10),
  "AGE"         NUMBER(3, 0),
  "CREATE_TIME" TIMESTAMP(6),
  "REMARK"      VARCHAR2(300),
  "CONTACTS"    VARCHAR2(100),
  PRIMARY KEY ("ID")
);

  CREATE TABLE "QJJ"."ADDRESS"(
    "ID" VARCHAR2(32) NOT NULL ,
     "USER_ID" VARCHAR(32),
    "CONSIGNEE_NAME" VARCHAR2(20),
    "CONSIGNEE_PHONE" VARCHAR2(20),
    "CONSIGNEE_ADDRESS"VARCHAR2(300),
    "DEFAULT_ADDRESS" VARCHAR2(300),
    "IS_DEFAULT"  NUMBER(3),
    "ADDRESS_TYPE" NUMBER(3),
    PRIMARY KEY ("ID")
  );


-------------

CREATE TABLE "QJJ"."ADDRESS"
(
  "ID"                VARCHAR2(32) NOT NULL ENABLE,
  "USER_ID"           VARCHAR2(32),
  "CONSIGNEE_NAME"    VARCHAR2(20),
  "CONSIGNEE_PHONE"   VARCHAR2(20),
  "CONSIGNEE_ADDRESS" VARCHAR2(300),
  "DEFAULT_ADDRESS"   VARCHAR2(300),
  "IS_DEFAULT"        NUMBER(3, 0),
  "ADDRESS_TYPE"      NUMBER(3, 0),
  PRIMARY KEY ("ID")
);

CREATE TABLE "QJJ"."SHOPPINGCART"
(
  "ID"             VARCHAR2(32) NOT NULL ENABLE,
  "USER_ID_SHOP"   VARCHAR2(32),
  "PRODUCT_ID"     VARCHAR2(32),
  "STATUS"         NUMBER(3, 0),
  "PRODUCT_NUMBER" NUMBER(4, 0),
  PRIMARY KEY ("ID")
);

--     CONSTRAINT USER_ID FOREIGN KEY (USER_ID) REFERENCES USERS (ID),

CREATE TABLE "QJJ"."ORDERS"
(
  "ID"             VARCHAR2(32) NOT NULL ENABLE,
  "ORDER_CONSIGNEE_NAME"    VARCHAR2(20),
  "ORDER_CONSIGNEE_PHONE"   VARCHAR2(20),
  "ORDER_CONSIGNEE_ADDRESS" VARCHAR2(300),
  "ORDER_CARRIAGE" NUMBER(10,2),
  "ORDER_STATUS"         NUMBER(3, 0),
  "ORDER_CREATE_DATE" TIMESTAMP (6),
  "ORDER_REF" VARCHAR2(32),
  "ORDER_ACTUAL_PAYMENT" NUMBER(10,2),
  "ORDER_TOTAL_PAYMENT" NUMBER(10,2),
  PRIMARY KEY ("ID")
);
COMMENT ON COLUMN ORDERS.ID IS '订单ID';
COMMENT ON COLUMN ORDERS.ORDER_CONSIGNEE_NAME IS '订单收货人姓名';
COMMENT ON COLUMN ORDERS.ORDER_CONSIGNEE_PHONE IS '订单收货人电话';
COMMENT ON COLUMN ORDERS.ORDER_CONSIGNEE_ADDRESS IS '订单收货人地址';
COMMENT ON COLUMN ORDERS.ORDER_CARRIAGE IS '订单运费';
COMMENT ON COLUMN ORDERS.ORDER_STATUS IS '订单状态';
COMMENT ON COLUMN ORDERS.ORDER_CREATE_DATE IS '下单日期';
COMMENT ON COLUMN ORDERS.ORDER_REF IS '订单编号';
COMMENT ON COLUMN ORDERS.ORDER_ACTUAL_PAYMENT IS '实际支付';
COMMENT ON COLUMN ORDERS.ORDER_TOTAL_PAYMENT IS '订单合计';


CREATE TABLE "QJJ"."ORDER_DETAILS"
(
  "ID"             VARCHAR2(32) NOT NULL ENABLE,
  "ORDER_ID"       VARCHAR2(32),
  "ORDER_PRODUCT_NAME" VARCHAR2(50),
  "ORDER_PRODUCT_IMAGE_URL" VARCHAR2(1000),
  "ORDER_PRICE" NUMBER(10,2),
  "ORDER_PRODUCT_NUMBER" NUMBER(3,0),
  PRIMARY KEY ("ID")
);
COMMENT ON COLUMN ORDER_DETAILS.ID IS '订单详情id';
COMMENT ON COLUMN ORDER_DETAILS.ORDER_ID IS '订单id';
COMMENT ON COLUMN ORDER_DETAILS.ORDER_DETAIL_PRODUCT_NAME IS '订单商品名称';
COMMENT ON COLUMN ORDER_DETAILS.ORDER_DETAIL_PRODUCT_IMAGE_URL IS '订单商品图片';
COMMENT ON COLUMN ORDER_DETAILS.ORDER_DETAIL_PRODUCT_PRICE IS '订单商品价格';
COMMENT ON COLUMN ORDER_DETAILS.ORDER_DETAIL_PRODUCT_NUMBER IS '订单商品数量';

CREATE TABLE "QJJ"."SEARCH_QUERY"
(
  "ID"             VARCHAR2(32) NOT NULL,
  "SEARCH_TYPE" NUMBER(3),
  "SEARCH_CONTENT" VARCHAR2(1000),
  "USER_ID" VARCHAR2(32),
  "SEARCH_TIME" TIMESTAMP(6),
  "SEARCH_NUMBER" NUMBER(3),
  PRIMARY KEY ("ID")
);
COMMENT ON COLUMN SEARCH_QUERY.ID IS '查询id';
COMMENT ON COLUMN SEARCH_QUERY.SEARCH_TYPE IS '查询类型';--0--热门搜索    --1--最近搜索
COMMENT ON COLUMN SEARCH_QUERY.SEARCH_CONTENT IS '查询内容';
COMMENT ON COLUMN SEARCH_QUERY.USER_ID IS '用户id';
COMMENT ON COLUMN SEARCH_QUERY.SEARCH_TIME IS '查询时间';
COMMENT ON COLUMN SEARCH_QUERY.SEARCH_NUMBER IS '查询次数';


CREATE TABLE "QJJ"."ORDER_DETAILS_MODIFY"
(
  "ID"                      VARCHAR2(32) NOT NULL ENABLE,
  "ORDER_CONSIGNEE_NAME"    VARCHAR2(20),
  "ORDER_CONSIGNEE_PHONE"   VARCHAR2(20),
  "ORDER_CONSIGNEE_ADDRESS" VARCHAR2(300),
  "ORDER_CARRIAGE"          NUMBER(10, 2),
  "ORDER_STATUS"            VARCHAR2(20),
  "ORDER_CREATE_DATE"       TIMESTAMP(6),
  "ORDER_REF"               VARCHAR2(32),
  "ORDER_ACTUAL_PAYMENT"    NUMBER(10, 2),
  "ORDER_TOTAL_PAYMENT"     NUMBER(10, 2),
  "ORDER_PRODUCT_ID"        CLOB,
  PRIMARY KEY ("ID")
)