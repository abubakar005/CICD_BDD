'use strict'

var module = angular.module('demo.controllers', []);
module.controller("UserController", [ "$scope", "UserService","$http",
		function($scope, UserService,$http) {

			$scope.login = function() {
			    var params = {
			        username: $scope.loginDTO.username,
                    password: $scope.loginDTO.password
                };
                $http({
                    method: 'GET',
                   // url: 'http://localhost:7788/cicddemo-bdd/',
                    url: 'http://localhost:7788/login',
                    params: params,
                    header: {
                        'Content-Type' : 'application/json'
                    }

                }).then(function (response) {

                    console.log(response);
                    if(response.data.response ==='Login Successful') {
                        window.location.href = "/success";
                       // window.location.href = "http://localhost:7788/cicddemo-bdd/success";
                    } else {
                        window.location.href = "/my-error";
                       // window.location.href = "http://localhost:7788/cicddemo-bdd/my-error";
                    }
                }).catch(function (reason) {
                    console.log("error occurred");
                    window.location.href = "/my-error";
                   // window.location.href = "http://localhost:7788/cicddemo-bdd/my-error";
                });
			}
		} ]);