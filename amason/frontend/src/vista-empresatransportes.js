import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-empresatransportes`
 *
 * VistaEmpresatransportes element.
 *
 * @customElement
 * @polymer
 */
class VistaEmpresatransportes extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-empresatransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresatransportes.is, VistaEmpresatransportes);
