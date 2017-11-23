<?php 
$opts = array(
			'http'=>array(
				'method'=>'GET';
				'header'=>'Content-type: application/json',
				)
);
$context=stream_context_create();
$url=file_get_contents(
			'http://localhost/MissionSlim/index.php/Bonjour',
			false,
			$context);
echo $url;
}
?>