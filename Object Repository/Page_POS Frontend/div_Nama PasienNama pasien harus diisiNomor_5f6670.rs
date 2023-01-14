<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Nama PasienNama pasien harus diisiNomor_5f6670</name>
   <tag></tag>
   <elementGuidId>3b1e4cc2-aa25-4001-9775-57ce6b09441b</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='prescription-data']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#prescription-data</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>605cb30a-4eb9-4f2a-bcef-c42cd7b6fb58</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col s9</value>
      <webElementGuid>e388b900-6451-4722-bdad-01b82b986a81</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>prescription-data</value>
      <webElementGuid>000d74e9-c42f-4b6c-85a7-8d200c8bf49c</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>


Nama Pasien*

Nama pasien harus diisi


Nomor Telepon*

Nomor telepon harus diisi


Alamat Pasien*

Alamat pasien harus diisi




Tanggal Lahir



NIK





Dokter*






Dokter harus diisi


PPK Asal*


RSUD CIBINONGRS FAMILY MEDICAL CENTERKec. GambirKel. Cempaka BaruKec. SenenKLINIK CITAMA BOJONGGEDECIBINONGRs CkiniRs Ciki



PPK asal harus diisi


Poli*






Poli harus diisi


Alamat Dokter Praktik*

Alamat dokter harus diisi




    .tosca {
        color: #9e9e9e;
        text-transform: capitalize;
    }


      
        
          Nomor Kartu
          
            Cari PesertaCari Peserta
        
      


    
        
            Nama Peserta*
            
        

        
        
        
        
                    
                        
                            
    No. resep*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($('form'));
  var poly_url = $('.poly_select2').data('url');
  $('.poly_select2').select2({
    minimumInputLength: 3,
    ajax: {
      dataType: 'json',
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $('.poly_select2').on('select2:select', function (e) {

          $('#poly').val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Npp*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($('form'));
  var poly_url = $('.poly_select2').data('url');
  $('.poly_select2').select2({
    minimumInputLength: 3,
    ajax: {
      dataType: 'json',
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $('.poly_select2').on('select2:select', function (e) {

          $('#poly').val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Nama_pasien*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($('form'));
  var poly_url = $('.poly_select2').data('url');
  $('.poly_select2').select2({
    minimumInputLength: 3,
    ajax: {
      dataType: 'json',
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $('.poly_select2').on('select2:select', function (e) {

          $('#poly').val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Nama obat*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($('form'));
  var poly_url = $('.poly_select2').data('url');
  $('.poly_select2').select2({
    minimumInputLength: 3,
    ajax: {
      dataType: 'json',
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $('.poly_select2').on('select2:select', function (e) {

          $('#poly').val(e.params.data.text);

  });

})


                        
                    
                        
                            

TANGGAL RESEP




                        
       
 








  $(document).ready(function() {
      Peentar.datePicker(&quot;.datepicker&quot;);
  });



</value>
      <webElementGuid>7703f9cc-167f-4ce6-9a6b-dcb7992edde4</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;prescription-data&quot;)</value>
      <webElementGuid>59a21cf6-5e7a-4146-bf32-6027344ce1ea</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='prescription-data']</value>
      <webElementGuid>4027b828-1298-4948-ba93-19f25d8f3bd2</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='edit_prescription_3063']/div[3]/div[2]</value>
      <webElementGuid>b4e0f46b-d6f8-44d3-9acb-1008c5cb60f6</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='ADMEDIKA PAYOR PT-'])[3]/following::div[1]</value>
      <webElementGuid>21bc1178-6fc3-47b9-b505-3e2cdb5b6775</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Kredit Resep'])[1]/following::div[1]</value>
      <webElementGuid>d9a639ce-d438-45e8-9c8a-91c16849cc4d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//form/div[3]/div[2]</value>
      <webElementGuid>1714a704-a0f7-470a-868b-6b28dd656456</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'prescription-data' and (text() = concat(&quot;


Nama Pasien*

Nama pasien harus diisi


Nomor Telepon*

Nomor telepon harus diisi


Alamat Pasien*

Alamat pasien harus diisi




Tanggal Lahir



NIK





Dokter*






Dokter harus diisi


PPK Asal*


RSUD CIBINONGRS FAMILY MEDICAL CENTERKec. GambirKel. Cempaka BaruKec. SenenKLINIK CITAMA BOJONGGEDECIBINONGRs CkiniRs Ciki



PPK asal harus diisi


Poli*






Poli harus diisi


Alamat Dokter Praktik*

Alamat dokter harus diisi




    .tosca {
        color: #9e9e9e;
        text-transform: capitalize;
    }


      
        
          Nomor Kartu
          
            Cari PesertaCari Peserta
        
      


    
        
            Nama Peserta*
            
        

        
        
        
        
                    
                        
                            
    No. resep*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Npp*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Nama_pasien*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Nama obat*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            

TANGGAL RESEP




                        
       
 








  $(document).ready(function() {
      Peentar.datePicker(&quot;.datepicker&quot;);
  });



&quot;) or . = concat(&quot;


Nama Pasien*

Nama pasien harus diisi


Nomor Telepon*

Nomor telepon harus diisi


Alamat Pasien*

Alamat pasien harus diisi




Tanggal Lahir



NIK





Dokter*






Dokter harus diisi


PPK Asal*


RSUD CIBINONGRS FAMILY MEDICAL CENTERKec. GambirKel. Cempaka BaruKec. SenenKLINIK CITAMA BOJONGGEDECIBINONGRs CkiniRs Ciki



PPK asal harus diisi


Poli*






Poli harus diisi


Alamat Dokter Praktik*

Alamat dokter harus diisi




    .tosca {
        color: #9e9e9e;
        text-transform: capitalize;
    }


      
        
          Nomor Kartu
          
            Cari PesertaCari Peserta
        
      


    
        
            Nama Peserta*
            
        

        
        
        
        
                    
                        
                            
    No. resep*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Npp*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Nama_pasien*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            
    Nama obat*

    




  Peentar.executeLater(function(){
  Peentar.Materialize.refreshForm($(&quot; , &quot;'&quot; , &quot;form&quot; , &quot;'&quot; , &quot;));
  var poly_url = $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).data(&quot; , &quot;'&quot; , &quot;url&quot; , &quot;'&quot; , &quot;);
  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).select2({
    minimumInputLength: 3,
    ajax: {
      dataType: &quot; , &quot;'&quot; , &quot;json&quot; , &quot;'&quot; , &quot;,
      delay: 1000,
      url: poly_url,
      data: function (params) {
        var query = {
          q: params.term
        };
        return query;
      },
      processResults: function (data) {
        if (data.error){
          Materialize.toast(&quot;Koneksi Bermasalah&quot;, 3000);
          return false;
        }
        return {
          results: data.poly
        };
      },
    },
  });

  $(&quot; , &quot;'&quot; , &quot;.poly_select2&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;select2:select&quot; , &quot;'&quot; , &quot;, function (e) {

          $(&quot; , &quot;'&quot; , &quot;#poly&quot; , &quot;'&quot; , &quot;).val(e.params.data.text);

  });

})


                        
                    
                        
                            

TANGGAL RESEP




                        
       
 








  $(document).ready(function() {
      Peentar.datePicker(&quot;.datepicker&quot;);
  });



&quot;))]</value>
      <webElementGuid>91c530e7-d9cd-4419-8116-bd4ae04e71d3</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
