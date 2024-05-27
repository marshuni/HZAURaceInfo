-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: Lion
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `LIONS`
--

/*!40000 DROP DATABASE IF EXISTS `Lion`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `LIONS` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `LIONS`;
-- 创建竞赛表

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE IF NOT EXISTS Contest (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    level VARCHAR(255),
    category VARCHAR(255),
    publisher VARCHAR(255),
    entryStart DATE,
    entryEnd DATE,
    contestStart DATE,
    contestEnd DATE,
    detail TEXT,
    poster VARCHAR(255)
)ENGINE=InnoDB;
LOCK TABLES Contest WRITE;
/*!40000 ALTER TABLE Contest DISABLE KEYS */;
INSERT INTO Contest VALUES (1,'2024年全国大学生数学建模竞赛', '国家级', '数学', '教育部', '2024-06-01', '2024-06-30', '2024-07-01', '2024-07-02', '2024年全国大学生数学建模竞赛', 'wu');
/*!40000 ALTER TABLE Contest ENABLE KEYS */;
UNLOCK TABLES;

-- 创建评价表
CREATE TABLE IF NOT EXISTS Review (
    RID INT PRIMARY KEY,
    UID VARCHAR(255),
    CID INT,
    value INT,
    difficultyContest INT,
    difficultyPrize INT,
    comment TEXT,
    FOREIGN KEY (CID) REFERENCES Contest(ID),
    FOREIGN KEY (UID) REFERENCES Users(UID)
) ENGINE=InnoDB;
LOCK TABLES Review WRITE;
/*!40000 ALTER TABLE Review DISABLE KEYS */;
INSERT INTO Review VALUES (1, '1', 1, 5, 5, 5, '很好');
/*!40000 ALTER TABLE Review ENABLE KEYS */;
UNLOCK TABLES;

-- 用户表
CREATE TABLE IF NOT EXISTS Users (
    UID VARCHAR(255) PRIMARY KEY,
    Authed BOOLEAN
) ENGINE=InnoDB;
LOCK TABLES Users WRITE;
/*!40000 ALTER TABLE Users DISABLE KEYS */;
INSERT INTO Users VALUES ('1',1);
/*!40000 ALTER TABLE Users ENABLE KEYS */;
UNLOCK TABLES;

-- 创建收藏表
CREATE TABLE IF NOT EXISTS Mark (
    MID INT PRIMARY KEY,
    CID INT,
    UID VARCHAR(255),
    scheduled BOOLEAN,
    FOREIGN KEY (CID) REFERENCES Contest(ID),
    FOREIGN KEY (UID) REFERENCES Users(UID)
);
LOCK TABLES Mark WRITE;
/*!40000 ALTER TABLE Mark DISABLE KEYS */;
INSERT INTO Mark VALUES (1, 1, '1', 1);
/*!40000 ALTER TABLE Mark ENABLE KEYS */;
UNLOCK TABLES;

-- 创建管理员表
CREATE TABLE IF NOT EXISTS Administrators (
    adminID VARCHAR(255) PRIMARY KEY,
    adminName VARCHAR(255),
    adminPassword VARCHAR(255)
);
LOCK TABLES Administrators WRITE;
/*!40000 ALTER TABLE Administrators DISABLE KEYS */;
INSERT INTO Administrators VALUES (1, 'admin', 'admin');
/*!40000 ALTER TABLE Administrators ENABLE KEYS */;
UNLOCK TABLES;

-- 竞赛消息表
CREATE TABLE IF NOT EXISTS ContestMessage (
    CMID INT PRIMARY KEY,
    date DATE,
    content TEXT,
    publisher VARCHAR(255),
    CID INT,
    FOREIGN KEY (CID) REFERENCES Contest(ID)
);
LOCK TABLES ContestMessage WRITE;
/*!40000 ALTER TABLE ContestMessage DISABLE KEYS */;
INSERT INTO ContestMessage VALUES (1, '2024-06-01', '2024年全国大学生数学建模竞赛开始报名', 'wu', 1);
/*!40000 ALTER TABLE ContestMessage ENABLE KEYS */;
UNLOCK TABLES;