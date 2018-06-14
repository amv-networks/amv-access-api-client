/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var access_api_auth_pb = require('./access_api_auth_pb.js');
goog.exportSymbol('proto.amv_access_api.CreateVehicleRequest', null, global);
goog.exportSymbol('proto.amv_access_api.CreateVehicleResponse', null, global);

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.amv_access_api.CreateVehicleRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.amv_access_api.CreateVehicleRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.amv_access_api.CreateVehicleRequest.displayName = 'proto.amv_access_api.CreateVehicleRequest';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.amv_access_api.CreateVehicleRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.amv_access_api.CreateVehicleRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.amv_access_api.CreateVehicleRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.amv_access_api.CreateVehicleRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    issuerAuth: (f = msg.getIssuerAuth()) && access_api_auth_pb.IssuerAuth.toObject(includeInstance, f),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    description: jspb.Message.getFieldWithDefault(msg, 3, ""),
    publicKeyBase64: jspb.Message.getFieldWithDefault(msg, 4, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.amv_access_api.CreateVehicleRequest}
 */
proto.amv_access_api.CreateVehicleRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.amv_access_api.CreateVehicleRequest;
  return proto.amv_access_api.CreateVehicleRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.amv_access_api.CreateVehicleRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.amv_access_api.CreateVehicleRequest}
 */
proto.amv_access_api.CreateVehicleRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new access_api_auth_pb.IssuerAuth;
      reader.readMessage(value,access_api_auth_pb.IssuerAuth.deserializeBinaryFromReader);
      msg.setIssuerAuth(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPublicKeyBase64(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.amv_access_api.CreateVehicleRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.amv_access_api.CreateVehicleRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.amv_access_api.CreateVehicleRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.amv_access_api.CreateVehicleRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIssuerAuth();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      access_api_auth_pb.IssuerAuth.serializeBinaryToWriter
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPublicKeyBase64();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional IssuerAuth issuer_auth = 1;
 * @return {?proto.amv_access_api.IssuerAuth}
 */
proto.amv_access_api.CreateVehicleRequest.prototype.getIssuerAuth = function() {
  return /** @type{?proto.amv_access_api.IssuerAuth} */ (
    jspb.Message.getWrapperField(this, access_api_auth_pb.IssuerAuth, 1));
};


/** @param {?proto.amv_access_api.IssuerAuth|undefined} value */
proto.amv_access_api.CreateVehicleRequest.prototype.setIssuerAuth = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.amv_access_api.CreateVehicleRequest.prototype.clearIssuerAuth = function() {
  this.setIssuerAuth(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.amv_access_api.CreateVehicleRequest.prototype.hasIssuerAuth = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.amv_access_api.CreateVehicleRequest.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.amv_access_api.CreateVehicleRequest.prototype.setName = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string description = 3;
 * @return {string}
 */
proto.amv_access_api.CreateVehicleRequest.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.amv_access_api.CreateVehicleRequest.prototype.setDescription = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string public_key_base64 = 4;
 * @return {string}
 */
proto.amv_access_api.CreateVehicleRequest.prototype.getPublicKeyBase64 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.amv_access_api.CreateVehicleRequest.prototype.setPublicKeyBase64 = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.amv_access_api.CreateVehicleResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.amv_access_api.CreateVehicleResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.amv_access_api.CreateVehicleResponse.displayName = 'proto.amv_access_api.CreateVehicleResponse';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.amv_access_api.CreateVehicleResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.amv_access_api.CreateVehicleResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.amv_access_api.CreateVehicleResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.amv_access_api.CreateVehicleResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    vehicleSerialNumber: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    description: jspb.Message.getFieldWithDefault(msg, 3, ""),
    publicKeyBase64: jspb.Message.getFieldWithDefault(msg, 4, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.amv_access_api.CreateVehicleResponse}
 */
proto.amv_access_api.CreateVehicleResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.amv_access_api.CreateVehicleResponse;
  return proto.amv_access_api.CreateVehicleResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.amv_access_api.CreateVehicleResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.amv_access_api.CreateVehicleResponse}
 */
proto.amv_access_api.CreateVehicleResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setVehicleSerialNumber(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPublicKeyBase64(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.amv_access_api.CreateVehicleResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.amv_access_api.CreateVehicleResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.amv_access_api.CreateVehicleResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.amv_access_api.CreateVehicleResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getVehicleSerialNumber();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPublicKeyBase64();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string vehicle_serial_number = 1;
 * @return {string}
 */
proto.amv_access_api.CreateVehicleResponse.prototype.getVehicleSerialNumber = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.amv_access_api.CreateVehicleResponse.prototype.setVehicleSerialNumber = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.amv_access_api.CreateVehicleResponse.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.amv_access_api.CreateVehicleResponse.prototype.setName = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string description = 3;
 * @return {string}
 */
proto.amv_access_api.CreateVehicleResponse.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.amv_access_api.CreateVehicleResponse.prototype.setDescription = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string public_key_base64 = 4;
 * @return {string}
 */
proto.amv_access_api.CreateVehicleResponse.prototype.getPublicKeyBase64 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.amv_access_api.CreateVehicleResponse.prototype.setPublicKeyBase64 = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};


goog.object.extend(exports, proto.amv_access_api);
