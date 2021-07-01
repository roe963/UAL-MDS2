import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-empresadetransportes.js';

class VistaEmpresasdetransportes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="layout-empresasTransportes">
 <vista-empresadetransportes id="vistaEmpresadetransportes"></vista-empresadetransportes>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-empresasdetransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresasdetransportes.is, VistaEmpresasdetransportes);
