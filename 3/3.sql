SELECT master.id, master.created, master.attr2, COUNT(CASE WHEN Detail.status = 0 THEN 1), COUNT(CASE WHEN Detail.status = 1 THEN 1) FROM Master 
LEFT JOIN Detail ON Master.id = Detail.masterFk
WHERE TRUNC(master.created) > TRUNC(SYSDATE-100)
GROUP BY master.id