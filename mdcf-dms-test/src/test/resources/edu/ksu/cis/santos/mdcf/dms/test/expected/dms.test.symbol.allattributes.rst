All (Declared and Inherited) Attributes
=======================================

* clas.ICEBloodPressure: (schema.ICEDevice, attr:id), (schema.ICEDevice, attr:manufacturerModel), (clas.ICEBloodPressure, attr:physioParams), (clas.ICEBloodPressure, attr:type)
* clas.ICEBloodPressureParam: (schema.ICEPhysioParameter, attr:alerts), (clas.ICEBloodPressureParam, attr:diastolic), (schema.ICEPhysioParameter, attr:exchanges), (clas.ICEBloodPressureParam, attr:physioParameterType), (schema.ICEPhysioParameter, attr:range), (clas.ICEBloodPressureParam, attr:systolic), (clas.ICEBloodPressureParam, attr:unit)
* clas.ICEMultiMonitor: (schema.ICEDevice, attr:id), (schema.ICEDevice, attr:manufacturerModel), (clas.ICEMultiMonitor, attr:physioParams), (clas.ICEMultiMonitor, attr:type)
* clas.ICEPulseOx: (schema.ICEDevice, attr:id), (schema.ICEDevice, attr:manufacturerModel), (clas.ICEPulseOx, attr:physioParams), (clas.ICEPulseOx, attr:type)
* clas.ICEPulseRate: (schema.ICEPhysioParameter, attr:alerts), (schema.ICEPhysioParameter, attr:exchanges), (clas.ICEPulseRate, attr:physioParameterType), (schema.ICEPhysioParameter, attr:range), (clas.ICEPulseRate, attr:unit)
* clas.ICESpO2: (schema.ICEPhysioParameter, attr:alerts), (schema.ICEPhysioParameter, attr:exchanges), (clas.ICESpO2, attr:physioParameterType), (schema.ICEPhysioParameter, attr:range), (clas.ICESpO2, attr:unit)
* device.MultiMonitor: (device.MultiMonitor, attr:id), (device.MultiMonitor, attr:manufacturerModel), (device.MultiMonitor, attr:physioParams), (clas.ICEMultiMonitor, attr:type)
* device.NellcorPulseOx: (device.NellcorPulseOx, attr:id), (device.NellcorPulseOx, attr:manufacturerModel), (device.NellcorPulseOx, attr:physioParams), (clas.ICEPulseOx, attr:type)
* device.NoninPulseOx: (device.NoninPulseOx, attr:id), (device.NoninPulseOx, attr:manufacturerModel), (device.NoninPulseOx, attr:physioParams), (clas.ICEPulseOx, attr:type)
* schema.BatteryLevelStatus: (schema.ICEDeviceStatus, attr:alarms), (schema.BatteryLevelStatus, attr:level), (schema.ICEDeviceStatus, attr:security)
* schema.ClientInitiated: (schema.ClientInitiated, attr:maxRetrievalRatePerSecond)
* schema.ComplexAlert: (schema.ComplexAlert, attr:cond)
* schema.DistributionSA: (schema.SampleArray, attr:attributes), (schema.SampleArray, attr:values)
* schema.Episodic: (schema.Episodic, attr:maxPublishRate)
* schema.ICEAlert
* schema.ICEDataExchange
* schema.ICEDevice: (schema.ICEDevice, attr:id), (schema.ICEDevice, attr:manufacturerModel), (schema.ICEDevice, attr:physioParams), (schema.ICEDevice, attr:type)
* schema.ICEDeviceSetting: (schema.ICEDeviceSetting, attr:security)
* schema.ICEDeviceStatus: (schema.ICEDeviceStatus, attr:alarms), (schema.ICEDeviceStatus, attr:security)
* schema.ICEManufacturerModel: (schema.ICEManufacturerModel, attr:credentials), (schema.ICEManufacturerModel, attr:modelNumber), (schema.ICEManufacturerModel, attr:versionNumber)
* schema.ICEMessageContext: (schema.ICEMessageContext, attr:messageConstructed)
* schema.ICEMetric
* schema.ICEPhysioParameter: (schema.ICEPhysioParameter, attr:alerts), (schema.ICEPhysioParameter, attr:exchanges), (schema.ICEPhysioParameter, attr:physioParameterType), (schema.ICEPhysioParameter, attr:range), (schema.ICEPhysioParameter, attr:unit)
* schema.ICESecurity
* schema.IntRange: (schema.IntRange, attr:max), (schema.IntRange, attr:min)
* schema.IntRangeSetting: (schema.IntRangeSetting, attr:max), (schema.IntRangeSetting, attr:min), (schema.ICEDeviceSetting, attr:security)
* schema.MetricAttribute
* schema.MetricTimeStampAttributes: (schema.MetricTimeStampAttributes, attr:hour), (schema.MetricTimeStampAttributes, attr:isdst), (schema.MetricTimeStampAttributes, attr:mday), (schema.MetricTimeStampAttributes, attr:min), (schema.MetricTimeStampAttributes, attr:mon), (schema.MetricTimeStampAttributes, attr:sec), (schema.MetricTimeStampAttributes, attr:wday), (schema.MetricTimeStampAttributes, attr:yday), (schema.MetricTimeStampAttributes, attr:year)
* schema.NatRange: (schema.NatRange, attr:max), (schema.NatRange, attr:min)
* schema.Numeric: (schema.Numeric, attr:attributes), (schema.Numeric, attr:observedValue), (schema.Numeric, attr:range)
* schema.ObsValue: (schema.ObsValue, attr:context), (schema.ObsValue, attr:measurementTaken), (schema.ICEMessageContext, attr:messageConstructed), (schema.ObsValue, attr:value)
* schema.ObsValueContext
* schema.Periodic: (schema.Periodic, attr:rateRange)
* schema.ProviderInitiated
* schema.Range: (schema.Range, attr:max), (schema.Range, attr:min)
* schema.RangeSetting: (schema.RangeSetting, attr:max), (schema.RangeSetting, attr:min), (schema.ICEDeviceSetting, attr:security)
* schema.RangeValueAlert: (schema.RangeSetting, attr:max), (schema.RangeSetting, attr:min), (schema.ICEDeviceSetting, attr:security)
* schema.RealTimeSA: (schema.SampleArray, attr:attributes), (schema.SampleArray, attr:values)
* schema.SampleArray: (schema.SampleArray, attr:attributes), (schema.SampleArray, attr:values)
* schema.StatusAttributes
* schema.TargetValueAlert: (schema.ICEDeviceSetting, attr:security), (schema.ValueSetting, attr:value)
* schema.TimeSA: (schema.TimeSA, attr:attributes), (schema.TimeSA, attr:values)
* schema.ValueChangeAlert
* schema.ValueSetting: (schema.ICEDeviceSetting, attr:security), (schema.ValueSetting, attr:value)