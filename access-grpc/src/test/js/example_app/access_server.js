var PROTO_BASE_PATH = __dirname + '/../../../main/proto';

var grpc = require('grpc');
var access_grpc = grpc.load(PROTO_BASE_PATH + '/access_api.proto').amv_access_api;

function createVehicle(call, callback) {
  var response = new access_grpc.CreateVehicleResponse();
  response.setVehicleSerialNumber('0123456789abcdef');
  response.setName('demo_vehicle');
  response.setDescription('a demo vehicle');
  response.setPublicKeyBase64(response.encode64());

  callback(null, response);
}

/**
 * Starts an RPC server that receives requests for the Vehicle service at the
 * sample server port
 */
function main() {
  var server = new grpc.Server();
  server.addService(access_grpc.VehicleService.service, {createVehicle: createVehicle});
  server.bind('0.0.0.0:50051', grpc.ServerCredentials.createInsecure());
  server.start();
}

main();