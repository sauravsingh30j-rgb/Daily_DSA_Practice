-- Last updated: 04/10/2025, 01:42:08
select P.product_name, S.year, S.price from Sales S
left join Product P on S.product_id = P.product_id

