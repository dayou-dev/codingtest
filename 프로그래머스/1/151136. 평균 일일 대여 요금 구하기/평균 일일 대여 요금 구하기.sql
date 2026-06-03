-- 코드를 입력하세요
SELECT ROUND(AVG(DAILY_FEE), 0) as AVERAGE_FEE from CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = 'SUV'
# ROUND : 반올림 함수, ROUND(숫자, 반올림할 자릿수), 두번째 인자 미지정 시 정수만 출력