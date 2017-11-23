<?php 
require 'vendor/autoload.php';
use \Psr\Http\Message\ServerRequestInterface as Request;
use \Psr\Http\Message\ResponseInterface as Response;

$app = new \Slim\App();

$app->post("/Bonjour", function(Request $request, Response $response){
	$response->getBody()->write("Bonjour");
	return $response;
});
$app->run();