<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<meta charset="utf-8" />
	<title>MyApp</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
	<h1>反応Logs
	<a th:href="@{/myapphan}">戻る</a>
	</h1>
	<table class="table">
		<tr>
			<th>
				データNo
			</th>
			<th>
				種別
			</th>
			<th>
				プレイヤー名
			</th>
			<th>
				タイム
			</th>
		</tr>
		<tr th:each="han :${list}">
			<td th:text="${han.data_id}"></td>
			<td th:text="${han.category}"></td>
			<td th:text="${han.user_name}"></td>
			<td th:text="${han.time}"></td>
		</tr>
		
	</table>
</body>
</html>