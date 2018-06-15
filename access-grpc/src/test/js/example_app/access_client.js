var PROTO_BASE_PATH = __dirname + '/../../../main/proto';

var grpc = require('grpc');
var access_grpc = grpc.load(PROTO_BASE_PATH + '/access_api.proto').amv_access_api;

function main() {
  var client = new access_grpc.VehicleService('localhost:50051',
                                       grpc.credentials.createInsecure());
  
  var request = new access_grpc.CreateVehicleRequest();
  request.setName('my_demo_vehicle');
  request.setDescription('my demo vehicle');

  client.createVehicle(request, (err, response) => {
    console.log('Error:', err);
    console.log('Response:', response);
    
    client.close();
  });
}

main();